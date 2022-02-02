package payrollsystem;

import java.text.NumberFormat;
import java.util.Locale;

public class CommissionEmployee extends Employee{
    
    NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
    
    private double grossSales;
    private double commissionRate;
    
    public CommissionEmployee(String nameFirst, String nameLast, String myKad, double grossSales, double commissionRate){
        super(nameFirst, nameLast, myKad);
        this.grossSales=grossSales;
        this.commissionRate=commissionRate;}

    public double getGrossSales(){
        return grossSales;}

    public void setGrossSales(double grossSales){
        this.grossSales = grossSales;}

    public double getCommissionRate(){
        return commissionRate;}

    public void setCommissionRate(double commissionRate){
        this.commissionRate = commissionRate;}
    
    @Override
    public String displayInfo(){
        
        System.out.printf("\nCommission employee : %s %s", getNameFirst(), getNameLast());
        System.out.println("\nMyKad               : " +getMyKad());
        System.out.println("Gross sales         : " +formatter.format(getGrossSales()));
        System.out.println("Commission rate     : " +getCommissionRate());
        System.out.println("Earned              : " +formatter.format(getEarnings()));
        
        return "";}
    
    @Override
    public double getEarnings(){
        return getCommissionRate()*getGrossSales();}
    
}

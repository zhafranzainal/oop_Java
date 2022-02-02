package payrollsystem;

public class CommissionEmployee extends Employee{
    
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
    public String getNameFirst(){
        return nameFirst;}

    @Override
    public String getNameLast(){
        return nameLast;}

    @Override
    public String getMyKad(){
        return myKad;}
    
    @Override
    public double getEarnings(){
        return getCommissionRate()*getGrossSales();}
    
}

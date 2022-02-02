package payrollsystem;

import java.text.NumberFormat;
import java.util.Locale;

public class SalariedEmployee extends Employee{
    
    NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
    
    private double monthlySalary;
    
    public SalariedEmployee(String nameFirst, String nameLast, String myKad, double monthlySalary){
        super(nameFirst, nameLast, myKad);
        this.monthlySalary=monthlySalary;}

    public double getMonthlySalary(){
        return monthlySalary;}

    public void setMonthlySalary(double monthlySalary){
        this.monthlySalary = monthlySalary;}
    
    @Override
    public String displayInfo(){
        
        System.out.printf("Salaried employee   : %s %s", getNameFirst(), getNameLast());
        System.out.println("\nMyKad               : " +getMyKad());
        System.out.println("Monthly salary      : " +formatter.format(getMonthlySalary()));
        System.out.println("Earned              : " +formatter.format(getEarnings()));
        
        return "";}
    
    @Override
    public double getEarnings(){
        return getMonthlySalary();}
    
}

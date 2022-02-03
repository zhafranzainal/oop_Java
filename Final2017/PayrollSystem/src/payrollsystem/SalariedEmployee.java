package payrollsystem;

import java.text.NumberFormat;
import java.util.Locale;

public class SalariedEmployee extends Employee{
    
    NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
    
    private double monthlySalary;
    
    public SalariedEmployee(String name, String myKad, double monthlySalary){
        super(name, myKad);
        this.monthlySalary=monthlySalary;}

    public double getMonthlySalary(){
        return monthlySalary;}

    public void setMonthlySalary(double monthlySalary){
        this.monthlySalary = monthlySalary;}
    
    @Override
    public String displayInfo(){
        
        System.out.println("Salaried employee   : " +getName());
        System.out.println("MyKad               : " +getMyKad());
        System.out.println("Monthly salary      : " +formatter.format(getMonthlySalary()));
        System.out.println("Earned              : " +formatter.format(getEarnings()));
        
        return "";}
    
    @Override
    public double getEarnings(){
        return getMonthlySalary();}
    
}

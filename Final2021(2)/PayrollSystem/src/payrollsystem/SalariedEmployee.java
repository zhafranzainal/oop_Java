package payrollsystem;

public class SalariedEmployee extends Employee{
    
    private double monthlySalary;
    
    public SalariedEmployee(String nameFirst, String nameLast, String myKad, double monthlySalary){
        super(nameFirst, nameLast, myKad);
        this.monthlySalary=monthlySalary;}

    public double getMonthlySalary(){
        return monthlySalary;}

    public void setMonthlySalary(double monthlySalary){
        this.monthlySalary = monthlySalary;}
    
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
        return getMonthlySalary();}
    
}

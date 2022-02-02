package payrollsystem;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    
    private double baseSalary;
    
    public BasePlusCommissionEmployee(String nameFirst, String nameLast, String myKad, double grossSales, double commissionRate, double baseSalary){
        super(nameFirst, nameLast, myKad, grossSales, commissionRate);
        this. baseSalary=baseSalary;}

    public double getBaseSalary(){
        return baseSalary;}

    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;}
    
    @Override
    public double getEarnings(){
        return super.getEarnings()+getBaseSalary();}
    
}

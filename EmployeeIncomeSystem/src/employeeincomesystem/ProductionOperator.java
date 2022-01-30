package employeeincomesystem;

import java.text.DecimalFormat;

public class ProductionOperator extends Employee{
    
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private double overtimeAllowance;
    
    public ProductionOperator(String staffID){
        super(staffID);
        overtimeAllowance=200;}
    
    @Override
    protected double calculateSalary(){
        return basicSalary+attendanceAllowance+overtimeAllowance;}
    
    @Override
    public void computeMonthlyIncome(){
        System.out.print(df.format(calculateSalary()+PART_TIME_SELLING_COOKIES));}
    
}

package employeeincomesystem;

import java.text.DecimalFormat;

public class Technician extends Employee{
    
    private static final DecimalFormat df = new DecimalFormat("0.00");
    private double criticalAllowance;
    
    public Technician(String staffID){
        super(staffID);
        criticalAllowance=370;}
    
    @Override
    protected double calculateSalary(){
        return basicSalary+attendanceAllowance+criticalAllowance;}
    
    @Override
    public void computeMonthlyIncome(){
        System.out.print(df.format(calculateSalary()+PART_TIME_SELLING_TAKAFUL));}    
}

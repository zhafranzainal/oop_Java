package employeeincomesystem;

abstract public class Employee implements Person{
    
    protected String staffID;
    protected double basicSalary;
    protected double attendanceAllowance;
    
    public Employee(String staffID){
        this.staffID=staffID;
        basicSalary=1500;
        attendanceAllowance=200;}

    protected String getStaffID(){
        return staffID;}
    
    protected double calculateSalary(){
        return basicSalary+attendanceAllowance;}
    
}

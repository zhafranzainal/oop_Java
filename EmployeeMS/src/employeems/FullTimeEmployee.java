package employeems;

public class FullTimeEmployee extends Employee{
    
    private double salary;
    private int numOfYearEmployed;
    private final double ALLOWANCE_RATE = 110;
    
    public FullTimeEmployee(String empNo, String name, double totalPayment, double salary, int numOfYearEmployed){
        super(empNo, name, totalPayment);
        this.salary=salary;
        this.numOfYearEmployed=numOfYearEmployed;}
    
    public double calculateAllowance(){        
        return numOfYearEmployed*ALLOWANCE_RATE;}
    
    @Override
    public double computeTotalPayment(){
        return totalPayment=salary+calculateAllowance();}

    public void setSalary(double salary){
        this.salary = salary;}

    public void setNumOfYearEmployed(int numOfYearEmployed){
        this.numOfYearEmployed = numOfYearEmployed;}

}

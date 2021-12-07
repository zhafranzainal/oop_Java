package employeems;

public class FullTimeEmployee extends Employee{
    
    private double salary;
    private int numOfYearEmployed;
    private double ALLOWANCE_RATE;
    
    public FullTimeEmployee(){
        ALLOWANCE_RATE=110;}
    
    public double calculateAllowance(){
        
        double allowance=0;
        
        allowance=getNumOfYearEmployed()*getALLOWANCE_RATE();
        
        return allowance;}
    
    @Override
    public double computeTotalPayment(){
        
        totalPayment=getSalary()+calculateAllowance();
        
        return totalPayment;}
    
    public double getSalary(){
        return salary;}

    public void setSalary(double salary){
        this.salary = salary;}

    public int getNumOfYearEmployed(){
        return numOfYearEmployed;}

    public void setNumOfYearEmployed(int numOfYearEmployed){
        this.numOfYearEmployed = numOfYearEmployed;}

    public double getALLOWANCE_RATE(){
        return ALLOWANCE_RATE;}

    public void setALLOWANCE_RATE(double ALLOWANCE_RATE){
        this.ALLOWANCE_RATE = ALLOWANCE_RATE;}

}

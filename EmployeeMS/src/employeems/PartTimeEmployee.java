package employeems;

public class PartTimeEmployee extends Employee{
    
    private int numberHourWork;
    private final double RATE_PER_HOUR = 3.5;
    
    public PartTimeEmployee(String empNo, String name, double totalPayment, int numberHourWork){
        super(empNo, name, totalPayment);
        this.numberHourWork=numberHourWork;}
    
    @Override
    public double computeTotalPayment(){        
        return totalPayment=numberHourWork*RATE_PER_HOUR;}

    public void setNumberHourWork(int numberHourWork){
        this.numberHourWork = numberHourWork;}

}

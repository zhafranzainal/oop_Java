package constructioncompany;

public class ContractEmployee extends Employee{
    
    private int numberHourWork;
    private static final float RATE_PER_HOUR = 3.5F;
    
    public ContractEmployee(int workTime){
        numberHourWork=workTime;}
    
    @Override
    public float computeTotalPayment(){
        System.out.println("You are Contract Employee");
        return totalPayment=numberHourWork*RATE_PER_HOUR;}
    
}

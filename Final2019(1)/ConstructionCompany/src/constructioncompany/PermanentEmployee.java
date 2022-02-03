package constructioncompany;

public class PermanentEmployee extends Employee{
    
    private float salary;
    private int numOfYearEmployed;
    public static final float ALLOWANCE_RATE = 110F;
    
    public PermanentEmployee(float salary, int yearEmploy){
        this.salary=salary;
        numOfYearEmployed=yearEmploy;}
    
    public float calculateAllowance(){
        return numOfYearEmployed*ALLOWANCE_RATE;}
    
    @Override
    public float computeTotalPayment(){
        System.out.println("You are Permanent Employee");
        return totalPayment=salary+calculateAllowance();}
    
}

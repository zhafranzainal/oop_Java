package employeems;

public class PartTimeEmployee extends Employee{
    
    private int numberHourWork;
    private double RATE_PER_HOUR;
    
    public PartTimeEmployee(){
        RATE_PER_HOUR=3.5;}
    
    @Override
    public double computeTotalPayment(){        
        
        totalPayment=getNumberHourWork()*getRATE_PER_HOUR();
        
        return totalPayment;}

    public int getNumberHourWork(){
        return numberHourWork;}

    public void setNumberHourWork(int numberHourWork){
        this.numberHourWork = numberHourWork;}

    public double getRATE_PER_HOUR(){
        return RATE_PER_HOUR;}

    public void setRATE_PER_HOUR(double RATE_PER_HOUR){
        this.RATE_PER_HOUR = RATE_PER_HOUR;}

}

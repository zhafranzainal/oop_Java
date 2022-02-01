package themeparkticketingsystem;

abstract public class Customer{
    
    protected String custName;
    protected int custAge;
    protected Attractions attraction;

    public String getCustName(){
        return custName;}

    public void setCustName(String custName){
        this.custName = custName;}

    public int getCustAge(){
        return custAge;}

    public void setCustAge(int custAge){
        this.custAge = custAge;}

    public Attractions getAttraction(){
        return attraction;}

    public void setAttraction(Attractions attraction){
        this.attraction = attraction;}
    
    public String getCustomerCategory(){
        return "";}
    
    public double getTicketPrice(){
        
        if(custAge<=12){
            return 45;}
        
        else if(custAge<55){
            return 70;}
        
        else{
            return 30;}
    
    }
    
    public double totalTicketPayment(){
        return 0;}
    
}

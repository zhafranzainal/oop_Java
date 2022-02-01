package themeparkticketingsystem;

public class Staff extends Customer{
    
    private String staffType;
    
    public Staff(Attractions attraction){
        this.attraction=attraction;}

    public String getStaffType(){
        return staffType;}

    public void setStaffType(String staffType){
        this.staffType = staffType;}
    
    public double discountPrice(){
        
        if(staffType.equalsIgnoreCase("management")){
            return 15;}
        
        else if(staffType.equalsIgnoreCase("admin")){
            return 10;}
        
        else if(staffType.equalsIgnoreCase("technical")){
            return 8.5;}
        
        return 0;}
    
    @Override
    public double totalTicketPayment(){
        return getTicketPrice()+getAttraction().getGamesPrice()-discountPrice();}
    
}

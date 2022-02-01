package themeparkticketingsystem;

public class Visitor extends Customer{
    
    private String membership;
    
    public Visitor(Attractions attraction){
        this.attraction=attraction;}

    public String getMembership(){
        return membership;}

    public void setMembership(String membership){
        this.membership = membership;}
    
    public double discountPrice(){
    
        if(membership.equalsIgnoreCase("platinum")){
            return 5;}
        
        else if(membership.equalsIgnoreCase("gold")){
            return 3.5;}
        
        else if(membership.equalsIgnoreCase("silver")){
            return 2;}
        
        return 0;}
    
    @Override
    public double totalTicketPayment(){
        return getTicketPrice()+getAttraction().getGamesPrice()-discountPrice();}
    
}

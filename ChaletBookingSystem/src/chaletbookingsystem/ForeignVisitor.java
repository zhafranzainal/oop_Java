package chaletbookingsystem;

public class ForeignVisitor extends Visitor{
    
    private String visitorOrigin;
    
    public ForeignVisitor(String visitorName, int visitorID, Booking booking, int lateCheckOutHour, String visitorOrigin){
        super(visitorName, visitorID, booking, lateCheckOutHour);
        this.visitorOrigin=visitorOrigin;}

    public String getVisitorOrigin(){
        return visitorOrigin;}
    
    public double specialDiscount(){
        
        double discount=0.05, discountPrice=0;
        
        discount = switch(visitorOrigin){
            case "Asia" -> 0.15;
            case "Europe" -> 0.10;
            case "North America" -> 0.08;
            default -> 0.05;
        };
        
        discountPrice=discount*booking.chaletBookingPrice();
        
        return discountPrice;}
    
    public double totalPayment(){
        
        double priceTotal=0;
        
        priceTotal=getBooking().chaletBookingPrice()+lateCheckOutPenalty()-specialDiscount();
        
        return priceTotal;}     
}

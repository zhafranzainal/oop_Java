package chaletbookingsystem;

public class LocalVisitor extends Visitor{

    private String couponType;
    
    public LocalVisitor(String visitorName, int visitorID, String visitorContactNo, int lateCheckOutHour, String couponType){
        super(visitorName, visitorID, visitorContactNo, lateCheckOutHour);
        this.couponType=couponType;}
    
    public String getCouponType(){
        return couponType;}
    
    public double specialDiscount(){
        
        double discount=0.05, discountPrice=0;
        
        discount = switch(couponType){
            case "Platinum" -> 0.25;
            case "Gold" -> 0.15;
            case "Silver" -> 0.10;
            default -> 0.05;
        };
        
        discountPrice=discount*booking.chaletBookingPrice();
        
        return discountPrice;}
    
    public double totalPayment(){
        
        double priceTotal=0;
        
        priceTotal=getBooking().chaletBookingPrice()+lateCheckOutPenalty()-specialDiscount();
        
        return priceTotal;}    
}

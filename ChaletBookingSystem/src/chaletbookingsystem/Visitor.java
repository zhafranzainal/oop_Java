package chaletbookingsystem;

public class Visitor{
    
    protected String visitorName;
    protected int visitorID;
    protected int lateCheckOutHour;
    protected String visitorContactNo;
    protected Booking booking;
    
    public Visitor(String visitorName, int visitorID, String visitorContactNo, int lateCheckOutHour){
        this.visitorName=visitorName;
        this.visitorID=visitorID;
        this.visitorContactNo=visitorContactNo;
        this.lateCheckOutHour=lateCheckOutHour;}
    
    public Visitor(String visitorName, int visitorID, Booking booking, int lateCheckOutHour){
        this.visitorName=visitorName;
        this.visitorID=visitorID;
        this.booking=booking;
        this.lateCheckOutHour=lateCheckOutHour;}

    public String getVisitorName(){
        return visitorName;}

    public int getVisitorID(){
        return visitorID;}

    public String getVisitorContactNo(){
        return visitorContactNo;}
    
    public Booking getBooking(){
        return booking;}
    
    public void setBooking(Booking booking){
        this.booking = booking;}

    public double lateCheckOutPenalty(){
        
        double pricePenalty=0;
        
        if(lateCheckOutHour<2){
            pricePenalty=15;}
        
        else if(lateCheckOutHour<4){
            pricePenalty=20;}
        
        else if(lateCheckOutHour<6){
            pricePenalty=25;}
        
        return pricePenalty;}
    
    public double totalPayment(){
        
        double priceTotal=0;
        
        priceTotal=getBooking().chaletBookingPrice()+lateCheckOutPenalty();
        
        return priceTotal;}
    
}

package chaletbookingsystem;

public class Booking{
    
    private Chalet chalet;
    private int bookingQuantity;
    
    public Booking(){
        chalet = new Chalet();}
    
    public Chalet getChalet(){
        return chalet;}
    
    public int getBookingQuantity(){
        return bookingQuantity;}
    
    public void setChalet(Chalet chalet){
        this.chalet = chalet;}
    
    public void setBookingQuantity(int bookingQuantity){
        this.bookingQuantity = bookingQuantity;}
    
    public double chaletBookingPrice(){
        
        double priceBooking=0;
        
        priceBooking = switch(chalet.getChaletType()){
            case "Premier" -> 756*bookingQuantity;
            case "Deluxe" -> 450*bookingQuantity;
            case "Superior" -> 300*bookingQuantity;
            default -> 150*bookingQuantity;
        };
        
        return priceBooking;}
    
}

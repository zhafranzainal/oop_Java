package honeybee_transaction;

public class HoneyBee_Sales{
    
    private static final double BASIC_PRICE = 8;
    private static final double HONEYCOMB = 7;
    private static final double BLACK_PEARL = 2.5;
    private int quantity;
    private int choice;
    
    public HoneyBee_Sales(int quantity, int choice){
        this.quantity=quantity;
        this.choice=choice;}
    
    public double getTotalPrice(){
        
        if(choice==2){
            return (getBASIC_PRICE()+getHONEYCOMB())*getQuantity();}
        
        else if(choice==3){
            return (getBASIC_PRICE()+getBLACK_PEARL())*getQuantity();}
        
        return getBASIC_PRICE()*getQuantity();
        
    }

    public static double getBASIC_PRICE() {
        return BASIC_PRICE;}

    public static double getHONEYCOMB() {
        return HONEYCOMB;}

    public static double getBLACK_PEARL(){
        return BLACK_PEARL;}

    public int getQuantity(){
        return quantity;}

    public void setQuantity(int quantity){
        this.quantity = quantity;}

    public int getChoice(){
        return choice;}

    public void setChoice(int choice){
        this.choice = choice;}
    
}

package cb20033_lt4;
/*
 * Name         : Ahmad Zhafran Faruqi bin Zainal Abidin
 * Student ID   : CB20033
 * Lab Group    : 05A
 * Task         : Lab Task 4
 */
public class Computer{
    
    protected String brand;
    protected double price;
    protected int quantity;
    
    public Computer(){
        brand = "DELL";
        price = 2000;
        quantity = 3;}
    
    public Computer(String brand){
        this.brand = brand;
        price = 2000;
        quantity = 3;}

    public String getBrand(){
        return brand;}

    public void setBrand(String brand){
        this.brand = brand;}

    public double getPrice(){
        return price;}

    public void setPrice(double price){
        this.price = price;}

    public int getQuantity(){
        return quantity;}

    public void setQuantity(int quantity){
        this.quantity = quantity;}
    
    protected double calculatePrice(){
        
        double totalPrice;
        
        totalPrice = price*quantity;
        
        return totalPrice;}
    
}

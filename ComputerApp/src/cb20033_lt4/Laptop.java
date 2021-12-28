package cb20033_lt4;
/*
 * Name         : Ahmad Zhafran Faruqi bin Zainal Abidin
 * Student ID   : CB20033
 * Lab Group    : 05A
 * Task         : Lab Task 4
 */
public class Laptop extends Computer{
    
    private String type;
    private double screenSize;
    private int memorySize;
    private Monitor monitor;
    
    public Laptop(String type, String brand, double screenSize){
        this.type = type;
        this.brand = brand;
        this.screenSize = screenSize;
        memorySize = 8;
        monitor = new Monitor();}
    
    public String getType(){
        return type;}

    public void setType(String type){
        this.type = type;}

    public String getBrand(){
        return brand;}

    public void setBrand(String brand){
        this.brand = brand;}

    public double getScreenSize(){
        return screenSize;}

    public void setScreenSize(double screenSize){
        this.screenSize = screenSize;}

    public int getMemorySize() {
        return memorySize;}

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;}

    public Monitor getMonitor() {
        return monitor;}

    public void setMonitor(Monitor monitor){
        this.monitor = monitor;}
    
    public void upgradeMemory(){}
    
    public void downgradeMemory(){}
    
    @Override
    protected double calculatePrice(){
        
        double totalPrice;
        
        totalPrice = price*quantity;
        
        if(quantity<=10){
            totalPrice+=2460;}
        else if(quantity<=50){
            totalPrice+=2260;}
        else{
            totalPrice+=2160;}
        
        return totalPrice;}
    
    @Override
    public void showOutput(){
        System.out.println("Show output for Laptop");}

    @Override
    public void processOutput(){
        System.out.println("Process digital output in Laptop");}

}

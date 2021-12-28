package cb20033_lt4;
/*
 * Name         : Ahmad Zhafran Faruqi bin Zainal Abidin
 * Student ID   : CB20033
 * Lab Group    : 05A
 * Task         : Lab Task 4
 */
public class Desktop extends Computer{
    
    private String formFactor;
    private int storageSize;
    private Monitor monitor;
    
    public Desktop(){
        formFactor = "microTower";
        brand = "HP";
        storageSize = 512;}
    
    public Desktop(Monitor monitor){
        super("HP");
        formFactor = "microTower";
        brand = "DELL";
        storageSize = 512;
        this.monitor = monitor;}

    public String getFormFactor(){
        return formFactor;}

    public void setFormFactor(String formFactor){
        this.formFactor = formFactor;}

    public String getBrand(){
        return brand;}

    public void setBrand(String brand){
        this.brand = brand;}

    public int getStorageSize(){
        return storageSize;}

    public void setStorageSize(int storageSize){
        this.storageSize = storageSize;}

    public Monitor getMonitor(){
        return monitor;}

    public void setMonitor(Monitor monitor){
        this.monitor = monitor;}
    
    @Override
    protected double calculatePrice(){
        
        double totalPrice;
        
        totalPrice = price*quantity;
        
        if(quantity<=10){
            totalPrice+=1450;}
        else if(quantity<=50){
            totalPrice+=1250;}
        else{
            totalPrice+=1150;}
        
        return totalPrice;}

    @Override
    public void showOutput(){
        System.out.println("Show output for Desktop");}

    @Override
    public void processOutput(){
        System.out.println("Process digital output in Desktop");}
    
}

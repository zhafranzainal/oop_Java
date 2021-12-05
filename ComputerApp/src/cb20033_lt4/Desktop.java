package cb20033_lt4;
/*
 * Name         : Ahmad Zhafran Faruqi bin Zainal Abidin
 * Student ID   : CB20033
 * Lab Group    : 05A
 * Task         : Lab Task 4
 */
public class Desktop{
    
    private String formFactor;
    private String brand;
    private int storageSize;
    private Monitor monitor;
    
    public Desktop(){
        formFactor = "microTower";
        brand = "HP";
        storageSize = 512;}
    
    public Desktop(Monitor monitor){
        formFactor = "microTower";
        brand = "HP";
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
    
}

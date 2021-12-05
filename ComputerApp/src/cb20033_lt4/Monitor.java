package cb20033_lt4;
/*
 * Name         : Ahmad Zhafran Faruqi bin Zainal Abidin
 * Student ID   : CB20033
 * Lab Group    : 05A
 * Task         : Lab Task 4
 */
public class Monitor{
    
    private int brightness;
    private double screenSize;
    
    public Monitor(){
        brightness = 250;
        screenSize = 17;}
    
    public void setBrightness(int brightness){
        this.brightness = brightness;}

    public void setScreenSize(double screenSize){
        this.screenSize = screenSize;}    
    
    public int getBrightness(){
        return brightness;}

    public double getScreenSize(){
        return screenSize;}
}

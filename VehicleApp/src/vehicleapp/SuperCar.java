package vehicleapp;

public class SuperCar extends Car{
    
    //Data Fields
    private int speedMax;
    
    //Constructor
    public SuperCar(String powertrain, String type, String transmission, String model, float cc, int speedMax){
        super(powertrain, type, transmission, model, cc);
        this.speedMax=speedMax;}
    
    //Overridden Methods
    @Override
    public int accelerate(){
        return speed+=50;}
    
    @Override
    public int brake(){
        return speed-=30;}
    
    @Override
    public int autoAccelerate(int accelerate){
                
        for(int loop=0;loop<accelerate;loop++){
            speed+=50;}
        
        return speed;}
    
    @Override
    public int autoBrake(int brake){
                
        for(int loop=0;loop<brake;loop++){
            speed-=30;}
        
        if(speed<0){
            speed=0;}
                
        return speed;}
    
    @Override
    public double getRoadtaxPrice(){
        
        double roadtaxPrice=10000;
        
        return roadtaxPrice;}
    
    //accessor method
    public int getSpeedMax(){
        return speedMax;}
    
    //mutator method
    public void setSpeedMax(int speedMax){
        this.speedMax = speedMax;}
    
}

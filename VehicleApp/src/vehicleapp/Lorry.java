package vehicleapp;

public class Lorry extends Vehicle{
    
    //Data Fields
    private float towCap;
    
    //Constructor
    public Lorry(String powertrain, String type, String transmission, float towCap){
        super(powertrain, type, transmission);
        this.towCap=towCap;}
    
    //Overridden Methods
    @Override
    public int accelerate(){
        return speed+=8;}
    
    @Override
    public int brake(){
        return speed-=10;}
    
    @Override
    public int autoAccelerate(int accelerate){
                
        for(int loop=0;loop<accelerate;loop++){
            speed+=8;}
        
        return speed;}
    
    @Override
    public int autoBrake(int brake){
                
        for(int loop=0;loop<brake;loop++){
            speed-=10;}
        
        if(speed<0){
            speed=0;}
                
        return speed;}
    
    @Override
    public double getRoadtaxPrice(){
        
        double roadtaxPrice=99;
        
        return roadtaxPrice;}
    
    //accessor method
    public float getTowCap(){
        return towCap;}
    
    //mutator method
    public void setTowCap(float towCap){
        this.towCap = towCap;}
    
}

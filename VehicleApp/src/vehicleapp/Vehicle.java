package vehicleapp;

public class Vehicle{
    
    private String powertrain;
    private String type;
    private String transmission;
    protected int speed;

    public Vehicle(String powertrain, String type, String transmission){
        this.powertrain = powertrain;
        this.type = type;
        this.transmission = transmission;
        speed = 60;}
    
    //accessor method
    public String getPowertrain(){
        return powertrain;}

    public String getType(){
        return type;}

    public String getTransmission(){
        return transmission;}
    
    public int getSpeed(){
        return speed;}
    
    public double getRoadtaxPrice(){
        
        double roadtaxPrice=0;
        
        if(type=="Car"){
            if(powertrain=="Gasoline"){
                roadtaxPrice=200;}
            else if(powertrain=="Hybrid"){
                roadtaxPrice=100;}
            else if(powertrain=="Electric"){
                roadtaxPrice=50;}}
        
        else if(type=="SUV" || type=="MPV"){
            if(powertrain=="Gasoline"){
                roadtaxPrice=300;}
            else if(powertrain=="Hybrid"){
                roadtaxPrice=150;}
            else if(powertrain=="Electric"){
                roadtaxPrice=100;}}
        
        else{
            roadtaxPrice=400;}
        
        return roadtaxPrice;}
    
    //mutator method
    public void setPowertrain(String powertrain){
        this.powertrain = powertrain;}
    
    public void setType(String type){
        this.type = type;}

    public void setTransmission(String transmission) {
        this.transmission = transmission;}
    
    public void setSpeed(int speed){
        this.speed = speed;}
    
    //methods or behaviours
    public int accelerate(){
        return speed+=10;}
    
    public int brake(){
        return speed-=5;}
    
    public int autoAccelerate(int accelerate){
                
        for(int loop=0;loop<accelerate;loop++){
            speed+=10;}
        
        return speed;}
    
    public int autoBrake(int brake){
                
        for(int loop=0;loop<brake;loop++){
            speed-=5;}
        
        if(speed<0){
            speed=0;}
                
        return speed;}
}

package vehicleapp;

public class Car extends Vehicle{
    
    private String model;
    private double cc;
        
    public Car(String powertrain, String type, String transmission, String model, float cc){
        super(powertrain, type, transmission);
        this.model=model;
        this.cc=cc;}

    //accessor & mutator method
    public String getModel(){
        return model;}

    public void setModel(String model) {
        this.model = model;}
    
    public double getCc(){
        return cc;}
    
    public void setCc(double cc){
        this.cc = cc;}
    
    public double getLiters(){
        return cc/1000;}
    
    @Override
    public double getRoadtaxPrice(){
        
        double roadtaxPrice=0;
        
        if(cc<=1000){
            roadtaxPrice=20;}
        
        else if(cc<=1200){
            roadtaxPrice=55;}
        
        else if(cc<=1400){
            roadtaxPrice=70;}
        
        else if(cc<=1600){
            roadtaxPrice=90;}
        
        else if(cc<=1800){
            roadtaxPrice=200+((cc-1600)*0.4);}
        
        else if(cc<=2000){
            roadtaxPrice=280+((cc-1800)*0.5);}
        
        else if(cc<=2500){
            roadtaxPrice=380+((cc-2000)*1);}
        
        else if(cc<=3000){
            roadtaxPrice=880+((cc-2500)*2.50);}
        
        else if(cc>3000){
            roadtaxPrice=2130+((cc-3000)*4.50);}
        
        return roadtaxPrice;}
}

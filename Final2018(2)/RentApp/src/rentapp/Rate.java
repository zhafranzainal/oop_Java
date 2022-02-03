package rentapp;

public class Rate{
    
    private int mileage;
    private int vehicleRate;
    private int rentDurationInDays;
    
    public Rate(){
        mileage=100;
        vehicleRate=0;
        rentDurationInDays=2;}

    public int getMileage(){
        return mileage;}
    
    public int getVehicleRate(){
        return vehicleRate;}

    public void setVehicleRate(int vehicleRate){
        this.vehicleRate = vehicleRate;}

    public int getRentDurationInDays(){
        return rentDurationInDays;}
    
    public double getRate(){
        return getVehicleRate()*getRentDurationInDays()+(getMileage()*0.5);}

}

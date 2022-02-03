package amazonprimemain;

public class Drone{
    
    private Package pack;
    private float deliveryTime;
    private int droneCode;
    
    public final String OTW = "ON THE WAY";
    public final String RD = "REACHING DESTINATION";
    public final String NA = "NOT ALLOWED";
    
    public Drone(Package pack){
        this.pack=pack;
        deliveryTime=0;
        droneCode=0;}
    
    public void droneDeliveryStatus(){
        
        if(pack.getWeight()<=10 && pack.getDistance()<=10){
            System.out.println("");
            System.out.println(OTW);
            droneCode=1;
            deliveryPeriod();;}
        
        else if(pack.getWeight()<=20 && pack.getDistance()<=15){
            System.out.println("");
            System.out.println(OTW);
            droneCode=2;
            deliveryPeriod();;}
        
        else{
            System.out.println("");
            System.out.print(NA);}
        
    }
    
    public void deliveryPeriod(){
        deliveryTime=pack.getWeight()+pack.getDistance();
        reachDestination();}
    
    public void reachDestination(){
        
        if(deliveryTime<=18 && droneCode==1){
            System.out.printf("Your package is %s within %s minutes", RD, deliveryTime);}
        
        else if(deliveryTime<=33 && droneCode==2){
            System.out.printf("Your package is %s within %s minutes", RD, deliveryTime);}
        
        else{
            System.out.print("..but, your package was lost during delivery. Please contact us.");}
        
    }
    
}

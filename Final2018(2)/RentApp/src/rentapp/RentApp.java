package rentapp;

import java.text.DecimalFormat;

public class RentApp{
    
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args){
        
        Customer cusObj = new Customer("Jane Dow", "900431-06-3434", 27, 'F');
        Vehicle vehObj = new Vehicle("Proton", "Persona", 2015);
        Rate ratObj = new Rate();
        
        if(vehObj.getMaker().equalsIgnoreCase("Proton") && vehObj.getModel().equalsIgnoreCase("Persona") && vehObj.getYear()==2015){
            ratObj.setVehicleRate(80);}
        
        else if(vehObj.getMaker().equalsIgnoreCase("Produa") && vehObj.getModel().equalsIgnoreCase("Kelisa") && vehObj.getYear()==2017){
            ratObj.setVehicleRate(50);}
        
        else if(vehObj.getMaker().equalsIgnoreCase("Nissan") && vehObj.getModel().equalsIgnoreCase("Xtrail") && vehObj.getYear()==2014){
            ratObj.setVehicleRate(40);}
        
        else if(vehObj.getMaker().equalsIgnoreCase("Honda") && vehObj.getModel().equalsIgnoreCase("EX5") && vehObj.getYear()==2016){
            ratObj.setVehicleRate(100);}

        System.out.println("\tABC Car Rental Service");
        System.out.println("\t\tSdn. Bhd.");
        
        System.out.println("\n\tCustomer Information");
        
        System.out.println("\nName        : " +cusObj.getName());
        System.out.println("IC Number   : " +cusObj.getNumIC());
        System.out.println("Age         : " +cusObj.getAge());
        System.out.println("Gender      : " +cusObj.getGender());

        System.out.println("\n\tVehicle Information");
        
        System.out.println("\nMaker       : " +vehObj.getMaker());
        System.out.println("Model       : " +vehObj.getModel());
        System.out.println("Year        : " +vehObj.getYear());
        System.out.println("Colour      : " +vehObj.getColour());
        
        System.out.println("\n\tRental Rate");

        System.out.println("\nDuration    : " +ratObj.getRentDurationInDays() +" Day(s)");
        System.out.println("Mileage     : " +ratObj.getMileage() +" KM");
        System.out.println("Amount      : RM" +df.format(ratObj.getRate()));
        
        System.out.println("");
        
    }
    
}

package vehicleapp;

public class VehicleApp{

    public static void main(String[] args){
        
        Tyre product1 = new Tyre(2, 3, 4, '0');
        
        //Array
        Vehicle transport[] = new Vehicle[3];
        
        //Parent class reference to child object
        transport[0] = new Lorry("Hybrid", "Lorry", "Manual", 5000);
        transport[1] = new Car("Electric", "Car", "Manual", "Proton", 3001);
        transport[2] = new SuperCar("Hybrid", "SUV", "Automatic", "Honda", 3000, 400);

        product1.setSpeedRating('V');
        
        //(1)upCasting Lorry
        System.out.printf("1. %s %s with %s transmission\n", transport[0].getPowertrain(), transport[0].getType(), transport[0].getTransmission());
        System.out.printf("Roadtax Price = RM%.2f\n\n", transport[0].getRoadtaxPrice());

        System.out.println("Current Speed (Accelerate) = " +transport[0].accelerate() +"km/h");        
        System.out.println("Current Speed (Brake)      = " +transport[0].brake() +"km/h");
        
        System.out.println("Current Speed (Accelerate) = " +transport[0].autoAccelerate(1) +"km/h");        
        System.out.println("Current Speed (Brake)      = " +transport[0].autoBrake(5) +"km/h\n");
        
        System.out.println("Tyre Speed Rating = " +product1.getSpeedRating() +"km/h");
        
        //(1)downCasting Lorry
        Lorry lorry1 = (Lorry) transport[0];
        System.out.printf("Towing Capability = %.2fkg\n", lorry1.getTowCap());
        
        //(2)upCasting Car
        System.out.printf("\n2. %s %s with %s transmission\n", transport[1].getPowertrain(), transport[1].getType(), transport[1].getTransmission());
        System.out.printf("Roadtax Price = RM%.2f\n\n", transport[1].getRoadtaxPrice());

        System.out.println("Current Speed (Accelerate) = " +transport[1].accelerate() +"km/h");        
        System.out.println("Current Speed (Brake)      = " +transport[1].brake() +"km/h");
        
        System.out.println("Current Speed (Accelerate) = " +transport[1].autoAccelerate(1) +"km/h");        
        System.out.println("Current Speed (Brake)      = " +transport[1].autoBrake(16) +"km/h\n");
        
        System.out.println("Tyre Speed Rating = " +product1.getSpeedRating() +"km/h");
        
        //(2)downCasting Car
        Car car1 = (Car) transport[1];
        System.out.printf("%.0fcc            = %.1fL\n", car1.getCc(), car1.getLiters());
        
        //(3)upCasting SuperCar
        System.out.printf("\n3. %s %s with %s transmission\n", transport[2].getPowertrain(), transport[2].getType(), transport[2].getTransmission());
        System.out.printf("Roadtax Price = RM%.2f\n\n", transport[2].getRoadtaxPrice());

        System.out.println("Current Speed (Accelerate) = " +transport[2].accelerate() +"km/h");        
        System.out.println("Current Speed (Brake)      = " +transport[2].brake() +"km/h");
        
        System.out.println("Current Speed (Accelerate) = " +transport[2].autoAccelerate(1) +"km/h");        
        System.out.println("Current Speed (Brake)      = " +transport[2].autoBrake(4) +"km/h\n");
        
        System.out.println("Tyre Speed Rating = " +product1.getSpeedRating() +"km/h");
        
        //(3)downCasting SuperCar
        SuperCar car2 = (SuperCar) transport[2];
        System.out.printf("Maximum Speed     = %dkm/h\n\n", car2.getSpeedMax());
    }
}

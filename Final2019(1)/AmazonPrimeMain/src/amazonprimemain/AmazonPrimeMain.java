package amazonprimemain;

import java.util.Scanner;

public class AmazonPrimeMain{

    public static void main(String[] args){
        
        Package pack = new Package();
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter package weight in kg : ");
        pack.setWeight(scan.nextFloat());
        
        System.out.print("Please enter distance in km       : ");
        pack.setDistance(scan.nextFloat());
        
        Drone dron = new Drone(pack);
        dron.droneDeliveryStatus();
        
        System.out.println("\n");
        
    }
    
}

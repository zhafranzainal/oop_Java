package cb20033_lt4;
/*
 * Name         : Ahmad Zhafran Faruqi bin Zainal Abidin
 * Student ID   : CB20033
 * Lab Group    : 05A
 * Task         : Lab Task 4
 */
import java.util.Scanner;

public class ComputerMain{

    public static void main(String[] args){
        
        Monitor myMonitor = new Monitor();
        Desktop myDesktop = new Desktop(myMonitor);
        Laptop myLaptop = new Laptop("Thinkpad", "Lenovo", 13.3);
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("THE OUTPUT INFORMATION FOR DESKTOP 1st ORDER");
        System.out.printf("Desktop Brand: %s | Desktop Form Factor: %s | Desktop Storage Size: %d | Desktop Screen Size: %.1f | Desktop Quantity: %d | Total Price for Desktop: RM%.2f", myDesktop.getBrand(), myDesktop.getFormFactor(), myDesktop.getStorageSize(), myDesktop.getMonitor().getScreenSize(), myDesktop.getQuantity(), myDesktop.calculatePrice());
        
        System.out.println("\n\nTHE INPUT FOR DESKTOP 2nd ORDER");
        System.out.print("Please enter the quantity amount to order: ");
        myDesktop.setQuantity(input.nextInt());
        
        System.out.println("\nTHE OUTPUT INFORMATION FOR DESKTOP 2nd ORDER");
        System.out.printf("Desktop Brand: %s | Desktop Form Factor: %s | Desktop Storage Size: %d | Desktop Screen Size: %.1f | Desktop Quantity: %d | Total Price for Desktop: RM%.2f", myDesktop.getBrand(), myDesktop.getFormFactor(), myDesktop.getStorageSize(), myDesktop.getMonitor().getScreenSize(), myDesktop.getQuantity(), myDesktop.calculatePrice());
        
        System.out.println("\n========================================================================================================================================================================");
        
        System.out.println("\nTHE OUTPUT INFORMATION FOR LAPTOP 1st ORDER");
        System.out.printf("Laptop Brand: %s | Laptop Type: %s | Laptop Memory Size: %d | Laptop Screen Size: %.1f | Laptop Quantity: %d | Total Price for Laptop: RM%.2f", myLaptop.getBrand(), myLaptop.getType(), myLaptop.getMemorySize(), myLaptop.getMonitor().getScreenSize(), myLaptop.getQuantity(), myLaptop.calculatePrice());
        
        System.out.println("\n\nTHE INPUT FOR LAPTOP 2nd ORDER");
        System.out.print("Please enter the quantity amount to order: ");
        myLaptop.setQuantity(input.nextInt());
        
        System.out.println("\nTHE OUTPUT INFORMATION FOR LAPTOP 2nd ORDER");
        System.out.printf("Laptop Brand: %s | Laptop Type: %s | Laptop Memory Size: %d | Laptop Screen Size: %.1f | Laptop Quantity: %d | Total Price for Laptop: RM%.2f", myLaptop.getBrand(), myLaptop.getType(), myLaptop.getMemorySize(), myLaptop.getMonitor().getScreenSize(), myLaptop.getQuantity(), myLaptop.calculatePrice());
        
        System.out.println("\n");
    }
}

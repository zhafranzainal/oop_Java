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
        
        System.out.println("THE INPUT MONITOR INFORMATION FOR DESKTOP");
        System.out.print("Please enter monitor brightness   : ");
        myDesktop.getMonitor().setBrightness(input.nextInt());

        System.out.print("Please enter monitor screen size  : ");        
        myDesktop.getMonitor().setScreenSize(input.nextDouble());

        System.out.println("\nTHE INPUT MONITOR INFORMATION FOR LAPTOP");
        System.out.print("Please enter monitor brightness   : ");
        myLaptop.getMonitor().setBrightness(input.nextInt());
        
        System.out.print("Please enter monitor screen size  : ");
        myLaptop.getMonitor().setScreenSize(input.nextDouble());
        
        System.out.println("\nTHE OUTPUT INFORMATION FOR DESKTOP");
        System.out.println("The following are the information for DESKTOP");
        System.out.printf("Desktop Brand: %s | Desktop Form Factor: %s | Desktop Storage Size: %d | Desktop Screen Size: %.1f | Desktop Brightness: %d", myDesktop.getBrand(), myDesktop.getFormFactor(), myDesktop.getStorageSize(), myDesktop.getMonitor().getScreenSize(), myDesktop.getMonitor().getBrightness());
        
        System.out.println("\n\nTHE OUTPUT INFORMATION FOR LAPTOP");
        System.out.println("The following are the information for LAPTOP");
        System.out.printf("Laptop Brand: %s | Laptop Type: %s | Laptop Memory Size: %d | Laptop Screen Size: %.1f | Laptop Brightness: %d", myLaptop.getBrand(), myLaptop.getType(), myLaptop.getMemorySize(), myLaptop.getMonitor().getScreenSize(), myLaptop.getMonitor().getBrightness());
        
        System.out.printf("\n\nMonitor Screen Size: %.1f", myMonitor.getScreenSize());
        
        myDesktop = null;
        myLaptop = null;
        System.out.println("");
        
    }
}

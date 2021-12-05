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
        
        Computer myComp1 = new Laptop("Thinkpad", "Lenovo", 13.3);
        Computer myComp2 = new Desktop(new Monitor());
        
        Scanner input = new Scanner(System.in);
        
        Laptop laptop = (Laptop) myComp1;
        
        System.out.println("CREATING RECORD FOR LAPTOP");
        System.out.print("Please enter new laptop type		: ");
        laptop.setType(input.nextLine());
        
        System.out.print("Please enter new laptop brand		: ");
        myComp1.setBrand(input.nextLine());
        
        System.out.print("Please enter new laptop screensize	: ");
        laptop.setScreenSize(input.nextDouble());
        
        Desktop desktop = (Desktop) myComp2;
        
        System.out.println("\nCREATING RECORD FOR DESKTOP");
        System.out.print("Please enter new desktop form factor	: ");
        desktop.setFormFactor(input.next());
        
        System.out.print("Please enter new desktop storage size	: ");
        desktop.setStorageSize(input.nextInt());

        System.out.println("\nDISPLAYING RECORD FOR LAPTOP");
        System.out.printf("Type for Laptop          : %s    || Brand for Laptop         : %s", laptop.getType(), laptop.getBrand());
        System.out.printf("\nScreen Size for Laptop   : %.1f      || Memory Size for Laptop   : %d", laptop.getScreenSize(), laptop.getMemorySize());

        System.out.println("\n\nDISPLAYING RECORD FOR DESKTOP");
        System.out.printf("Brand for Desktop: %s || Form Factor for Desktop: %s || Storage Size for Desktop: %d", desktop.getBrand(), desktop.getFormFactor(), desktop.getStorageSize());
        
        System.out.println("\n");
    }
}

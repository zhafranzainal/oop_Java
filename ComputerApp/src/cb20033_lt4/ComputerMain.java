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
        
        Scanner input = new Scanner(System.in);
        
        Computer myComputer[] = new Computer[2];
        
        for(int loop=0;loop<myComputer.length;loop++){
            
            if(loop<1){
                System.out.println("CREATING RECORD FOR LAPTOP");
                myComputer[loop] = new Laptop(null, null, 0);
                Laptop mylap = (Laptop) myComputer[loop];
                System.out.print("Please enter new laptop type		: ");
                mylap.setType(input.nextLine());
        
                System.out.print("Please enter new laptop brand		: ");
                myComputer[loop].setBrand(input.nextLine());
        
                System.out.print("Please enter new laptop screensize	: ");
                mylap.setScreenSize(input.nextDouble());
                input.nextLine();}
                
            else{
                myComputer[loop] = new Desktop(new Monitor());
                Desktop mydesk = (Desktop) myComputer[loop];
                System.out.println("\nCREATING RECORD FOR DESKTOP");
                System.out.print("Please enter new desktop form factor	: ");
                mydesk.setFormFactor(input.next());
        
                System.out.print("Please enter new desktop storage size	: ");
                mydesk.setStorageSize(input.nextInt());}
        }
        
        for(int loop=0;loop<myComputer.length;loop++){
            
            if(myComputer[loop] instanceof Laptop){
                Laptop mylap = (Laptop) myComputer[loop];
                System.out.println("\nDISPLAYING RECORD FOR LAPTOP");
                System.out.printf("Type for Laptop%d          : %s\t || Brand for Laptop%d         : %s", loop+1, mylap.getType(), loop+1, mylap.getBrand());
                System.out.printf("\nScreen Size for Laptop%d   : %.1f\t || Memory Size for Laptop%d   : %d", loop+1, mylap.getScreenSize(), loop+1, mylap.getMemorySize());
                System.out.println("\nDigital machine bit: " +DigitalMachine.BIT);
                mylap.processOutput();
                System.out.println("INPUT from  : " +ElectronicDevice.INPUT);
                System.out.println("OUTPUT to   : " +ElectronicDevice.OUTPUT);
                mylap.showOutput();}
        
            else{
                Desktop mydesk = (Desktop) myComputer[loop];
                System.out.println("\nDISPLAYING RECORD FOR DESKTOP");
                System.out.printf("Brand for Desktop%d: %s\t || Form Factor for Desktop%d: %s\t || Storage Size for Desktop%d: %d", loop+1, mydesk.getBrand(), loop+1, mydesk.getFormFactor(), loop+1, mydesk.getStorageSize());
                System.out.println("\nDigital machine bit: " +DigitalMachine.BIT);
                mydesk.processOutput();
                System.out.println("INPUT from  : " +ElectronicDevice.INPUT);
                System.out.println("OUTPUT to   : " +ElectronicDevice.OUTPUT);
                mydesk.showOutput();}
        }
        
        System.out.println("");
    }
}
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
        
        ComputerFactory compfact = new ComputerFactory();
        Computer laptop=null, desktop=null;
        int flag=0;
        
        while(flag<2){
            System.out.print("Select your preferred digital machine (laptop/desktop): ");
            String machineType = input.nextLine();
            
            if(machineType.equalsIgnoreCase("laptop")){
                
                laptop = compfact.getComputer(machineType);
                Laptop mylap = (Laptop) laptop;
                System.out.println("\nCREATING RECORD FOR LAPTOP");
                System.out.print("Please enter new laptop type		: ");
                mylap.setType(input.nextLine());
        
                System.out.print("Please enter new laptop brand		: ");
                mylap.setBrand(input.nextLine());
        
                System.out.print("Please enter new laptop screensize	: ");
                mylap.setScreenSize(input.nextDouble());
                input.nextLine();
            
                System.out.println("");}
            
            else{
                
                desktop = compfact.getComputer(machineType);
                Desktop mydesk = (Desktop) desktop;
                System.out.println("\nCREATING RECORD FOR DESKTOP");
                System.out.print("Please enter new desktop form factor	: ");
                mydesk.setFormFactor(input.next());
        
                System.out.print("Please enter new desktop storage size	: ");
                mydesk.setStorageSize(input.nextInt());
                
            }
            flag++;
        }
        
        for(int loop=0;loop<2;loop++){
            
            if(loop==0){
                
                System.out.println("\nDISPLAYING RECORD FOR LAPTOP");
                System.out.printf("Type for Laptop          : %s\t || Brand for Laptop         : %s", ((Laptop)laptop).getType(), ((Laptop)laptop).getBrand());
                System.out.printf("\nScreen Size for Laptop   : %.1f\t || Memory Size for Laptop   : %d", ((Laptop)laptop).getScreenSize(), ((Laptop)laptop).getMemorySize());
                System.out.println("\nDigital machine bit      : " +DigitalMachine.BIT);
                ((Laptop)laptop).processOutput();
                System.out.println("INPUT from  : " +ElectronicDevice.INPUT);
                System.out.println("OUTPUT to   : " +ElectronicDevice.OUTPUT);
                ((Laptop)laptop).showOutput();}
        
            else{
                
                System.out.println("\nDISPLAYING RECORD FOR DESKTOP");
                System.out.printf("Brand for Desktop     : %s\t || Form Factor for Desktop: %s\t || Storage Size for Desktop: %d", ((Desktop)desktop).getBrand(), ((Desktop)desktop).getFormFactor(), ((Desktop)desktop).getStorageSize());
                System.out.println("\nDigital machine bit   : " +DigitalMachine.BIT);
                ((Desktop)desktop).processOutput();
                System.out.println("INPUT from  : " +ElectronicDevice.INPUT);
                System.out.println("OUTPUT to   : " +ElectronicDevice.OUTPUT);
                ((Desktop)desktop).showOutput();}
        }
        
        System.out.println("");
    }
}
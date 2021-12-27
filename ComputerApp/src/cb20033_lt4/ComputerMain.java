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
        
        //Array
        Computer myComputer[] = new Computer[4];
        Laptop laptop[] = new Laptop[2];
        Desktop desktop[] = new Desktop[2];
        
        for(int loop=0;loop<2;loop++){
            myComputer[loop] = new Laptop(null, null, 0);}
        
        for(int loop=2;loop<4;loop++){
            myComputer[loop] = new Desktop(new Monitor());}
        
        for(int loop=0;loop<2;loop++){
            laptop[loop] = (Laptop) myComputer[loop];}
        
        for(int loop=0;loop<2;loop++){
            System.out.println("CREATING RECORD FOR LAPTOP");
            System.out.print("Please enter new laptop type		: ");
            laptop[loop].setType(input.nextLine());
        
            System.out.print("Please enter new laptop brand		: ");
            myComputer[loop].setBrand(input.nextLine());
        
            System.out.print("Please enter new laptop screensize	: ");
            laptop[loop].setScreenSize(input.nextDouble());
            input.nextLine();}
        
        for(int loop=2;loop<4;loop++){
            desktop[loop-2] = (Desktop) myComputer[loop];}
        
        for(int loop=0;loop<2;loop++){
            System.out.println("\nCREATING RECORD FOR DESKTOP");
            System.out.print("Please enter new desktop form factor	: ");
            desktop[loop].setFormFactor(input.next());
        
            System.out.print("Please enter new desktop storage size	: ");
            desktop[loop].setStorageSize(input.nextInt());}
        
        for(int loop=0;loop<2;loop++){
            System.out.println("\nDISPLAYING RECORD FOR LAPTOP");
            System.out.printf("Type for Laptop%d          : %s\t || Brand for Laptop%d         : %s", loop+1, laptop[loop].getType(), loop+1, laptop[loop].getBrand());
            System.out.printf("\nScreen Size for Laptop%d   : %.1f\t || Memory Size for Laptop%d   : %d", loop+1, laptop[loop].getScreenSize(), loop+1, laptop[loop].getMemorySize());}
        
        System.out.println("");
        
        for(int loop=0;loop<2;loop++){
            System.out.println("\nDISPLAYING RECORD FOR DESKTOP");
            System.out.printf("Brand for Desktop%d: %s\t || Form Factor for Desktop%d: %s\t || Storage Size for Desktop%d: %d", loop+3, desktop[loop].getBrand(), loop+3, desktop[loop].getFormFactor(), loop+3, desktop[loop].getStorageSize());}
        
        System.out.println("\n");
    }
}
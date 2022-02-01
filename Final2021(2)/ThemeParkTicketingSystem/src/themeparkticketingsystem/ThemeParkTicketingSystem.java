package themeparkticketingsystem;

import java.util.Scanner;
import java.text.DecimalFormat;

public class ThemeParkTicketingSystem{

    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    public static void main(String[] args){
        
        Customer cust[] = new Customer[2];
        Attractions fantasyGarden = new FantasyGarden();
        Attractions galaxyStation = new GalaxyStation();
        Scanner input = new Scanner(System.in);
        
        int custType, chosenAttraction;
        
        CustomerFactory factCust = new CustomerFactory();
        for(int loop=0;loop<cust.length;loop++){
            cust[loop] = null;}
        
        System.out.println("\tINPUT PAYMENT INFORMATION");
        System.out.println("\t_________________________");
        
        for(int loop=0;loop<cust.length;loop++){
            
            System.out.println("\nCUSTOMER #" +(loop+1));
            System.out.print("Enter customer type [1=Staff; 2=Visitor]                : ");
            custType=input.nextInt();
            
            System.out.print("Enter attraction [1=Fantasy Garden; 2=Galaxy Station]   : ");
            chosenAttraction=input.nextInt();
            input.nextLine();
                
            if(chosenAttraction==1){
                cust[loop] = factCust.getCustType(custType, fantasyGarden);}
                
            else{
                cust[loop] = factCust.getCustType(custType, galaxyStation);}
            
            if(custType==1){
                                
                Staff staff = (Staff) cust[loop];
                
                System.out.print("\nEnter staff name                                : ");
                staff.setCustName(input.nextLine());
                
                System.out.print("Enter staff age                                 : ");
                staff.setCustAge(input.nextInt());
                input.nextLine();
                
                System.out.print("Enter staff type [Management/Admin/Technical]   : ");
                staff.setStaffType(input.nextLine());}
                
            else if(custType==2){
                
                Visitor visitor = (Visitor) cust[loop];
                
                System.out.print("\nEnter visitor name                                : ");
                visitor.setCustName(input.nextLine());
                
                System.out.print("Enter visitor age                                 : ");
                visitor.setCustAge(input.nextInt());
                input.nextLine();
                
                System.out.print("Enter visitor membership [Platinum/Gold/Silver]   : ");
                visitor.setMembership(input.nextLine());}
            
            if(chosenAttraction==1){
                System.out.println("\nFantasy Garden:-");
                System.out.println("\t1. Cosmo Theater");
                System.out.println("\t2. Honey Bump");
                System.out.println("\t3. Crazy Bus");}
                
            else{
                System.out.println("\nGalaxy Station:-");
                System.out.println("\t1. Dizzy Izzy");
                System.out.println("\t2. Supersonic Odyssey");
                System.out.println("\t3. Spinning Object");}
                
            System.out.print("\nEnter game selection: ");
            cust[loop].getAttraction().selectGameAndPrice(input.nextInt());
            
        }
        
        System.out.println("\n\tDISPLAY PAYMENT INFORMATION");
        System.out.println("\t___________________________");
        
        for(int loop=0;loop<cust.length;loop++){
            
            System.out.println("");
            
            if(cust[loop] instanceof Staff){
                Staff staff = (Staff) cust[loop];
                System.out.println("Staff Name          : " +staff.getCustName());
                System.out.println("Staff Age           : " +staff.getCustAge());
                System.out.println("Staff Type          : " +staff.getStaffType());
                System.out.println("Staff Game Name     : " +staff.getAttraction().getGamesName());}
            
            else{
                Visitor visitor = (Visitor) cust[loop];
                System.out.println("Visitor Name        : " +visitor.getCustName());
                System.out.println("Visitor Age         : " +visitor.getCustAge());
                System.out.println("Visitor Membership  : " +visitor.getMembership());
                System.out.println("Visitor Game Name   : " +visitor.getAttraction().getGamesName());}

            System.out.println("Game Price          : RM" +df.format(cust[loop].getAttraction().getGamesPrice()));
            System.out.println("Total Ticket Price  : RM" +df.format(cust[loop].totalTicketPayment()));
                        
        }
        
        System.out.println("");
        
    }
}

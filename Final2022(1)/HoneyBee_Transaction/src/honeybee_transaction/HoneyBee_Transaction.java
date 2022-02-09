package honeybee_transaction;

import java.util.Scanner;
import java.text.NumberFormat;

public class HoneyBee_Transaction{

    public static void main(String[] args){
        
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        Scanner input = new Scanner(System.in);
        
        HoneyBee_Sales honey = new HoneyBee_Sales(0,0);
        
        System.out.println("WELCOME TO HONEYBEE FROZEN YOGURT!");
        System.out.println("Basic=1; Add-on honeycomb=2; Add-on black pearl=3\n");
        
        System.out.print("Enter honey ice cream option  : ");
        honey.setChoice(input.nextInt());
        
        System.out.print("Enter quantity                : ");
        honey.setQuantity(input.nextInt());
        
        System.out.println("\nTotal price: " +formatter.format(honey.getTotalPrice()));
        
        System.out.println("");
    }
    
}

package mykadapp;

import java.util.Scanner;

public class MyKadApp{

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
                
        MyKad mykad = new MyKad();
        
        System.out.print("Enter MyKad number (without space) >> ");
        mykad.setMykadNumber(input.next());

        System.out.println("\n<< MyKad Info >>");
        System.out.println("Day             : " +mykad.getDay());
        System.out.println("Month           : " +mykad.getMonth());
        System.out.println("Year            : " +mykad.getYear());
        System.out.println("Gender          : " +mykad.getGender());
        System.out.println("Place of birth  : " +mykad.getPOB());
        
        System.out.println("");
    }
}

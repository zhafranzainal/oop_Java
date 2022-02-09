package primenumberapp;

import java.util.Scanner;

public class PrimeNumberApp{

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        Digit_Prime_Number num = new Digit_Prime_Number();
        
        System.out.print("Enter the number: ");
        num.setNumber(input.nextInt());
        
        if(num.Prime_Number()){
            System.out.println(num.getNumber() +" is Digits_Prime");}
        else{
            System.out.println(num.getNumber() +" is Not_Digit_Prime");}
        
        System.out.println("");
        
    }
    
}

package dairyfarm;

import java.text.DecimalFormat;

public class DairyFarm{
    
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args){
        
        int loop;
        
        //Array
        Animal animal[] = new Animal[15];
        
        //Parent class reference to child object
        animal[0] = new Cow(500);
        animal[1] = new Cow(625);
        animal[2] = new Cow(718);
        animal[3] = new Cow(813);
        animal[4] = new Cow(995);
        
        animal[5] = new Goat(55);
        animal[6] = new Goat(65);
        animal[7] = new Goat(50);
        animal[8] = new Goat(30);
        animal[9] = new Goat(40);
        animal[10] = new Goat(70);
        animal[11] = new Goat(80);
        animal[12] = new Goat(90);
        animal[13] = new Goat(20);
        animal[14] = new Goat(30);
        
        System.out.println("**COW INFO**");
        for(loop=0;loop<5;loop++){
            System.out.println("\nCow ID: " +(loop+1));
            System.out.println("Weight                  = " +animal[loop].weight +" kg");
            System.out.println("Total milk production   = " +df.format(animal[loop].calculateMilkProduction()) +" litre");
            System.out.println("Daily sales             = RM" +df.format(animal[loop].calculateDailySales()));}
        
        System.out.println("\n**GOAT INFO**");
        for(loop=5;loop<15;loop++){
            System.out.println("\nGoat ID: " +(loop-4));
            System.out.println("Weight                  = " +animal[loop].weight +" kg");
            System.out.println("Total milk production   = " +df.format(animal[loop].calculateMilkProduction()) +" litre");
            System.out.println("Daily sales             = RM" +df.format(animal[loop].calculateDailySales()));}
        
        System.out.println("");
        
    } 
}

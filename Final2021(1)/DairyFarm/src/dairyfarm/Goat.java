package dairyfarm;

public class Goat extends Animal{
    
    private double C = 1.05;
    private double D = 22;
    
    public Goat(int weight){
        super(weight);}
    
    @Override
    public double calculateMilkProduction(){
        return C*(weight/D);}
    
    @Override
    public double calculateDailySales(){
        return calculateMilkProduction()*12;}
    
}

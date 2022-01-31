package dairyfarm;

public class Cow extends Animal{
    
    private double A = 1.15;
    private double B = 0.25;
    
    public Cow(int weight){
        super(weight);}
    
    @Override
    public double calculateMilkProduction(){
        return (A*weight)+B;}
    
    @Override
    public double calculateDailySales(){
        return calculateMilkProduction()*4.5;}
    
}

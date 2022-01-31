package dairyfarm;

abstract public class Animal{
    
    protected int weight;
    
    public Animal(int weight){
        this.weight=weight;}
    
    public double calculateMilkProduction(){
        return 0;}
    
    public double calculateDailySales(){
        return 0;}
    
}

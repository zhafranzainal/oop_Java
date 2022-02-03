package rentapp;

public class Vehicle{
    
    private String maker;
    private String model;
    private int year;
    private String colour;
    
    public Vehicle(String maker, String model, int year){
        this.maker=maker;
        this.model=model;
        this.year=year;
        colour="Silver Metallic";}

    public String getMaker(){
        return maker;}

    public String getModel(){
        return model;}

    public int getYear(){
        return year;}

    public String getColour(){
        return colour;}
    
}

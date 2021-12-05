package vehicleapp;

public class Tyre{
    
    private Vehicle vehicle;
    private int rimDiameter;
    private int width;
    private int aspectRatio;
    private char speedRating;

    public Tyre(int rimDiameter, int width, int aspectRatio, char speedRating){
        this.rimDiameter=rimDiameter;
        this.width=width;
        this.aspectRatio=aspectRatio;
        this.speedRating=speedRating;}
    
    //accessor & mutator method
    public int getRimDiameter(){
        return rimDiameter;}
    
    public void setRimDiameter(int rimDiameter){
        this.rimDiameter = rimDiameter;}

    public int getWidth(){
        return width;}

    public void setWidth(int width){
        this.width = width;}

    public int getAspectRatio(){
        return aspectRatio;}

    public void setAspectRatio(int aspectRatio){
        this.aspectRatio = aspectRatio;}

    public void setSpeedRating(char speedRating){
        this.speedRating = speedRating;} 
    
    public int getSpeedRating(){
        
        int rating=0;
        
        switch(speedRating){
            case 'R' -> rating=170;
            case 'S' -> rating=180;
            case 'T' -> rating=190;
            case 'U' -> rating=200;
            case 'H' -> rating=210;
            case 'V' -> rating=240;
            default -> {}
        }
        
        return rating;}
}
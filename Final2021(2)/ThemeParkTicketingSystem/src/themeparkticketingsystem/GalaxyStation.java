package themeparkticketingsystem;

public class GalaxyStation implements Attractions{
    
    private String gamesName;
    private double gamesPrice;
    
    @Override
    public void selectGameAndPrice(int gamesNumber){
        gamesName=switch(gamesNumber){
            case 1->"Dizzy Izzy";
            case 2->"Supersonic Odyssey";
            default->"Spinning Object";};
    }
    
    @Override
    public String getGamesName(){
        return gamesName;}
    
    @Override
    public double getGamesPrice(){
        
        gamesPrice=switch(getGamesName()){
            case "Dizzy Izzy"->10;
            case "Supersonic Odyssey"->11;
            default->8.5;};
        
        return gamesPrice;}
    
}

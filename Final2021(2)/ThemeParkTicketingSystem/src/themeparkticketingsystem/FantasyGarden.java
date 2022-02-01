package themeparkticketingsystem;

public class FantasyGarden implements Attractions{
    
    private String gamesName;
    private double gamesPrice;
    
    @Override
    public void selectGameAndPrice(int gamesNumber){
        gamesName=switch(gamesNumber){
            case 1->"Cosmo Theater";
            case 2->"Honey Bump";
            default->"Crazy Bus";};
    }
    
    @Override
    public String getGamesName(){
        return gamesName;}
    
    @Override
    public double getGamesPrice(){
        
        gamesPrice=switch(getGamesName()){
            case "Cosmo Theater"->5.5;
            case "Honey Bump"->6.5;
            default->4.5;};
        
        return gamesPrice;}
    
}

package mentalhealthdiagnosissystem;

public class Anxiety implements Patient{
    
    @Override
    public void diagnosis(){
        System.out.println("Anxiety");}
    
    @Override
    public String definition(){
        return "Frequently have intense and persistent worry and fear about everyday situations.";}
    
    @Override
    public void suggestion(){
        System.out.println("1) Reach out to family and friends");
        System.out.println("\t      2) Get some exercise");}
    
}

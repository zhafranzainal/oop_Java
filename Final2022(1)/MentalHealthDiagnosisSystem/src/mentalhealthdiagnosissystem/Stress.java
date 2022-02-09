package mentalhealthdiagnosissystem;

public class Stress implements Patient{
    
    @Override
    public void diagnosis(){
        System.out.println("Stress");}
    
    @Override
    public String definition(){
        return "Feeling of being overwhelmed or unable to cope with mental or emotional pressure.";}
    
    @Override
    public void suggestion(){
        System.out.println("1) Take time to relax");
        System.out.println("\t      2) Practice self-care");}
    
}

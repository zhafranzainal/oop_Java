package mentalhealthdiagnosissystem;

public class Depression implements Patient{
    
    @Override
    public void diagnosis(){
        System.out.println("Depression");}
    
    @Override
    public String definition(){
        return "Mood disorder that causes a persistent feeling of sadness and loss of interest.";}
    
    @Override
    public void suggestion(){
        System.out.println("1) Get help early");
        System.out.println("\t      2) Get some exercise");}
    
}

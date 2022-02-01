package studentprogramrecommendationsystem;

public class Master implements Student{
    
    @Override
    public void programType(){
        System.out.println("Master");}
    
    @Override
    public double studyFees(){
        return 10000.40;}
    
    @Override
    public String prerequisite(){
        return "Bachelor";}
    
}

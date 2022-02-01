package studentprogramrecommendationsystem;

public class Diploma implements Student{
    
    @Override
    public void programType(){
        System.out.println("Diploma");}
    
    @Override
    public double studyFees(){
        return 13500.50;}
    
    @Override
    public String prerequisite(){
        return "SPM";}
    
}

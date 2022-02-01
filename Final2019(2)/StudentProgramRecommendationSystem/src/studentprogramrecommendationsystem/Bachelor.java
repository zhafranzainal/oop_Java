package studentprogramrecommendationsystem;

public class Bachelor implements Student{
    
    @Override
    public void programType(){
        System.out.println("Bachelor");}
    
    @Override
    public double studyFees(){
        return 12000.40;}
    
    @Override
    public String prerequisite(){
        return "Matriculation or Diploma";}
    
}

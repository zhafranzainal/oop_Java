package studentprogramrecommendationsystem;

public class StudentFactory{
    
    public Student getProgramType(String studyMode, String careerGoal){
        
        Student obj = null;
        
        if(studyMode.equalsIgnoreCase("Research") && careerGoal.equalsIgnoreCase("Professional")){
            obj = new Master();}
        
        else if(studyMode.equalsIgnoreCase("Coursework") && careerGoal.equalsIgnoreCase("Professional")){
            obj = new Bachelor();}
        
        else if(studyMode.equalsIgnoreCase("Coursework") && careerGoal.equalsIgnoreCase("Technical")){
            obj = new Diploma();}
        
        else{
            System.out.println("\nSorry, no program fits your preference at the moment!");}
        
        return obj;
        
    }
    
}

package studentprogramrecommendationsystem;

import java.util.Scanner;
import java.text.DecimalFormat;

public class StudentProgramRecommendationSystem{
    
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        String studyMode, careerGoal;
        
        System.out.print("Input Study Mode (research/coursework)        >> ");
        studyMode=input.nextLine();
        
        System.out.print("Input Career Goal (professional/technical)    >> ");
        careerGoal=input.nextLine();
        
        StudentFactory factStud = new StudentFactory();
        Student programType = factStud.getProgramType(studyMode, careerGoal);
        
        if(programType!=null){
            System.out.println("\nOutput >>");
            System.out.print("Program Type    : ");
            programType.programType();
            System.out.println("Study Fees      : RM" +df.format(programType.studyFees()));
            System.out.println("Prerequisite    : " +programType.prerequisite());}
        
        System.out.println("");
        
    }
    
}

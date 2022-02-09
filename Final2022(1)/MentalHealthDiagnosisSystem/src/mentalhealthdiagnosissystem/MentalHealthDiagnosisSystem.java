package mentalhealthdiagnosissystem;

import java.util.Scanner;

public class MentalHealthDiagnosisSystem{

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        String sxPhyscial, sxMental;
        
        System.out.print("Input Physical Symptom  >> ");
        sxPhyscial=input.nextLine();
        
        System.out.print("Input Mental Symptom    >> ");
        sxMental=input.nextLine();
        
        PatientFactory factPatient = new PatientFactory();
        Patient patient = factPatient.getDiagnosis(sxPhyscial, sxMental);
        
        if(patient!=null){
            System.out.println("\nOutput >>");
            System.out.print("Diagnosis   : ");
            patient.diagnosis();
            System.out.println("Definition  : " +patient.definition());
            System.out.print("Suggestion  : ");
            patient.suggestion();}
        
        System.out.println("");
        
    }
    
}

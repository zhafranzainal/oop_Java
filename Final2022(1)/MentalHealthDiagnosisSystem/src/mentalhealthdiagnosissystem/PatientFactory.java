package mentalhealthdiagnosissystem;

public class PatientFactory{
    
    public Patient getDiagnosis(String sxPhyscial, String sxMental){
        
        Patient obj = null;
        
        if(sxPhyscial.equalsIgnoreCase("Trouble Sleeping") && sxMental.equalsIgnoreCase("Feelings Fear")){
            obj = new Anxiety();}
        
        else if(sxPhyscial.equalsIgnoreCase("Low energy level") && sxMental.equalsIgnoreCase("Feelings Sadness")){
            obj = new Depression();}
        
        else if(sxPhyscial.equalsIgnoreCase("Headaches") && sxMental.equalsIgnoreCase("Constantly Worrying")){
            obj = new Stress();}
        
        else{
            System.out.println("\nSorry, please refer to the nearest health centre for further diagnosis!");}
        
        return obj;
        
    }
    
}

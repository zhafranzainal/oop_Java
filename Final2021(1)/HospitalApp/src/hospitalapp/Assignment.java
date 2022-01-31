package hospitalapp;

public class Assignment{
    
    private Patient patient;
    private Doctor doctor;
    public static int count=0;

    public Assignment(){}
    
    public void addPatient(Patient patient){
        this.patient=patient;}
    
    public void addDoctor(Doctor doctor){
        this.doctor=doctor;}
    
    public void assignPatientToDoctor(){        
        doctor.addPatient(patient);
        count++;}
    
    public void showDoctorsAndPatients(){
                
        System.out.println("\nDoctor Info");
        System.out.println("Name: " +doctor.getName());
        
        System.out.println("\nPatient Info");
        for(int loop=0;loop<count;loop++){
            System.out.printf("%d. Name: %s\n", loop+1, patient.getName());}
        
        System.out.println("");
        
    }
    
}

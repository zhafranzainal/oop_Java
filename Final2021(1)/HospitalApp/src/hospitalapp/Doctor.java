package hospitalapp;

public class Doctor extends Person{
    
    private Patient patient;
    private String expertise;
    
    public Doctor(String name, int age, String gender){
        super(name, age, gender);}

    public String getExpertise(){
        return expertise;}

    public void setExpertise(String expertise){
        this.expertise = expertise;}
    
    public void addPatient(Patient patient){
        this.patient = patient;}
    
    public void print(){
    
        System.out.println("\nData that you stored:-");
        System.out.println("Name    : " +getName());
        System.out.println("Age     : " +getAge());
        System.out.println("Gender  : " +getGender());
        System.out.println("Disease : " +getExpertise());
    
    }

}

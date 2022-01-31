package hospitalapp;

public class Patient extends Person{
    
    private String disease;
    
    public Patient(String name, int age, String gender){
        super(name, age, gender);}

    public String getDisease(){
        return disease;}

    public void setDisease(String disease){
        this.disease=disease;}

    public void print(){
    
        System.out.println("\nData that you stored:-");
        System.out.println("Name    : " +getName());
        System.out.println("Age     : " +getAge());
        System.out.println("Gender  : " +getGender());
        System.out.println("Disease : " +getDisease());
        
    }
    
}

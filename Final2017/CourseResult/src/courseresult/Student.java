package courseresult;

public class Student{
    
    private String name;
    private String matricNo;
    private int yearOfStudy;
    private int subjectTotal;
    
    public Student(){
        name=null;
        matricNo=null;
        yearOfStudy=0;
        subjectTotal=0;}
    
    public Student(String name, String matricNo, int yearOfStudy, int subjectTotal){
        this.name=name;
        this.matricNo=matricNo;
        this.yearOfStudy=yearOfStudy;
        this.subjectTotal=subjectTotal;}
    
}

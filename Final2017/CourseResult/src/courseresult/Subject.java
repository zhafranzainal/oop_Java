package courseresult;

public class Subject{
    
    private String subjectName;
    private int creditHours;
    private String subjectGrade;
    
    public Subject(){
        subjectName=null;
        creditHours=0;
        subjectGrade=null;}
    
    public Subject(String subjectName, int creditHours, String subjectGrade){
        this.subjectName=subjectName;
        this.creditHours=creditHours;
        this.subjectGrade=subjectGrade;}

    public void setSubjectName(String subjectName){
        this.subjectName = subjectName;}

    public void setCreditHours(int creditHours){
        this.creditHours = creditHours;}

    public void setSubjectGrade(String subjectGrade){
        this.subjectGrade = subjectGrade;}
    
    public void displayInfo(){
        System.out.printf("%s\t\t %d\t\t %s\n", subjectName, creditHours, subjectGrade);}
    
}

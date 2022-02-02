package payrollsystem;

abstract public class Employee{
    
    protected String nameFirst;
    protected String nameLast;
    protected String myKad;
    
    public Employee(String nameFirst, String nameLast, String myKad){
        this.nameFirst=nameFirst;
        this.nameLast=nameLast;
        this.myKad=myKad;}

    public String getNameFirst(){
        return nameFirst;}

    public void setNameFirst(String nameFirst){
        this.nameFirst = nameFirst;}

    public String getNameLast(){
        return nameLast;}

    public void setNameLast(String nameLast){
        this.nameLast = nameLast;}

    public String getMyKad(){
        return myKad;}

    public void setMyKad(String myKad){
        this.myKad = myKad;}
    
    public String displayInfo(){
        return "";}
    
    abstract double getEarnings();
    
}

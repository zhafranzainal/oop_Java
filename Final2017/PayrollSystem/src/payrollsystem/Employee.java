package payrollsystem;

abstract public class Employee{
    
    protected String name;
    protected String myKad;
    
    public Employee(String name, String myKad){
        this.name=name;
        this.myKad=myKad;}

    public String getName(){
        return name;}

    public void setName(String name){
        this.name = name;}

    public String getMyKad(){
        return myKad;}

    public void setMyKad(String myKad){
        this.myKad = myKad;}
    
    public String displayInfo(){
        return "";}
    
    abstract double getEarnings();
    
}

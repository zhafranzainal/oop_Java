package gradingapp;

public class Student{
    
    private int age;
    private String name;
    private char gender;
    private boolean flag;//true == PASS || false == FAIL
    private int mark;
    
    public Student(int age, String name, char gender, boolean flag, int mark){
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.flag = flag;
        this.mark = mark;}

    public int getAge(){
        return age;}
    
    public String getName(){
        return name;}
    
    public char getGender(){
        return gender;}
    
    public boolean getFlag(){
        return flag;}
    
    public int getMark(){
        return mark;}

}

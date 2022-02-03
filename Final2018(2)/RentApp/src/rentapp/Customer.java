package rentapp;

public class Customer{
    
    private String name;
    private String numIC;
    private int age;
    private char gender;
    
    public Customer(String name, String numIC, int age, char gender){
        this.name=name;
        this.numIC=numIC;
        this.age=age;
        this.gender=gender;}

    public String getName(){
        return name;}

    public String getNumIC(){
        return numIC;}

    public int getAge(){
        return age;}

    public char getGender(){
        return gender;}
    
}

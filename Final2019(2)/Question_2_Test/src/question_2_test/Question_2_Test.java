package question_2_test;

public class Question_2_Test{

    public static void main(String[] args){
        
        //Parent class reference to child object
        A a = new B();
        
        //Downcasting
        B b = (B) a;
        
        System.out.println(b.number(-1));
        System.out.println(b.compareString(b.setUpperCase("bcs2143")));
        
    }
    
}

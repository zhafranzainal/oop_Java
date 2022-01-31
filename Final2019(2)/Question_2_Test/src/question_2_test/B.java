package question_2_test;

public class B implements A{
    
    @Override
    public boolean number(int num){
        return num>=0;}

    @Override
    public String setUpperCase(String str){
        return str.toUpperCase();}
    
    public boolean compareString(String str){
        return str.equals(A.STR);}
    
}

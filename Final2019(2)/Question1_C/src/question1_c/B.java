package question1_c;

public class B{
    
    private A a;
    private C c;
    
    public B(A a){
        this.a=a;
        c = new C();}

    public String getA(){
        return a.getA();}

    public String getC(){
        return c.getC();}
    
}

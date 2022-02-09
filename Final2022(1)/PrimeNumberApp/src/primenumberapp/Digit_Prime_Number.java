package primenumberapp;

public class Digit_Prime_Number{
    
    private int number;
    private int d_sum;
    private boolean flag;//true == Digits_Prime || false == Not_Digit_Prime
    
    public Digit_Prime_Number(){
        number=0;}
    
    public boolean Prime_Number(){
        
        int digit=number;
        
        while(digit>0){
            d_sum+=(digit%10);
            digit/=10;}
        
        if(d_sum==0||d_sum==1){
            return flag=false;}
        
        else{
            
            for(int loop=2;loop<=d_sum/2;loop++){
                if(d_sum%loop==0){
                    return flag=false;}
            }
            
            return flag=true;
            
        }
        
    }
    
    public void setNumber(int number){
        this.number=number;}
    
    public int getNumber(){
        return number;}
    
}

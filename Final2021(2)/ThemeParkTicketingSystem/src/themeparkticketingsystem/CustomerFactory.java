package themeparkticketingsystem;

public class CustomerFactory{
    
    public Customer getCustType(int custType, Attractions attraction){
        
        Customer obj = null;
        
        if(custType==1){
            obj = new Staff(attraction);}
        
        else if(custType==2){
            obj = new Visitor(attraction);}
        
        else{
            System.out.println("\nInvalid input!");}
        
        return obj;
        
    }
    
}

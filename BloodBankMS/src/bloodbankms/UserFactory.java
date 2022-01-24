package bloodbankms;

public class UserFactory{
    
    public User getUser(char userChoice){
        
        User obj = null;

        if(userChoice=='A'){
            obj = new Donor(null, null, null, null, 0, 0, null, null, 0, 0, 0);}
        
        else if(userChoice=='B'){
            obj = new Patient(null, null, null, null, 0, 0, null, null);}
        
        else{
            System.out.println("Invalid Input!");}
        
        return obj;
    }
    
}

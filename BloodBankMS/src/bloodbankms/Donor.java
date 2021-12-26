package bloodbankms;

public class Donor extends User{
    
    private int lastWeekDonation;
    
    public Donor(String id, String password, String name, int age, int weight, String bloodGroup, int lastWeekDonation){
        super(id, password, name, age, weight, bloodGroup);
        this.lastWeekDonation=lastWeekDonation;}
    
    public String checkEligibilty(){
        
        if(getWeight()>=45 && (getAge()>=18 && getAge()<=65)){
            
            if(lastWeekDonation>=12){
                return "Yes";}
            else{
                int weekRemaining=12-lastWeekDonation;
                return "You have to wait for " +weekRemaining +" week(s) before donating again";}}
        
        else{
            return "No";}
        
    }
    
    public String checkRecipient(){
        
        //Array
        String bloodType[] = new String[8];
        
        bloodType[0]="A+";
        bloodType[1]="O+";
        bloodType[2]="B+";
        bloodType[3]="AB+";
        bloodType[4]="A-";
        bloodType[5]="O-";
        bloodType[6]="B-";
        bloodType[7]="AB-";        
        
        if(bloodGroup.equals("A+")){
            return bloodType[0] +", " +bloodType[3];}
        
        else if(bloodGroup.equals("O+")){
            return bloodType[1] +", " +bloodType[0] +", " +bloodType[2] +", " +bloodType[3];}
        
        else if(bloodGroup.equals("B+")){
            return bloodType[2] +", " +bloodType[3];}

        else if(bloodGroup.equals("AB+")){
            return bloodType[3];}

        else if(bloodGroup.equals("A-")){
            return bloodType[0] +", " +bloodType[4] +", " +bloodType[3] +", " +bloodType[7];}

        else if(bloodGroup.equals("O-")){
            return "Everyone";}

        else if(bloodGroup.equals("B-")){
            return bloodType[2] +", " +bloodType[6] +", " +bloodType[3] +", " +bloodType[7];}

        else{
            return bloodType[3] +", " +bloodType[7];}        
        
    }
    
}

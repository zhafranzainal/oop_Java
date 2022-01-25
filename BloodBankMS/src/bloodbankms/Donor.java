package bloodbankms;

public class Donor extends User{
    
    private int healthStatus;//1 == Well || 2 == Not Well
    private int anonymity;//1 == Private || 2 == Public
    private int lastWeekDonation;
    
    public Donor(String id, String password, String name, String gender, int age, float weight, String bloodGroup, Hospital hospital, int healthStatus, int anonymity, int lastWeekDonation){
        super(id, password, name, gender, age, weight, bloodGroup, hospital);
        this.healthStatus=healthStatus;
        this.anonymity=anonymity;
        this.lastWeekDonation=lastWeekDonation;}
    
    public int getHealthStatus(){
        return healthStatus;}

    public void setHealthStatus(int healthStatus){
        this.healthStatus = healthStatus;}

    public int getAnonymity(){
        return anonymity;}

    public void setAnonymity(int anonymity){
        this.anonymity = anonymity;}

    public int getLastWeekDonation(){
        return lastWeekDonation;}

    public void setLastWeekDonation(int lastWeekDonation){
        this.lastWeekDonation = lastWeekDonation;}
    
    public String checkEligibilty(){
        
        if(getWeight()>=45 && (getAge()>=18 && getAge()<=65)){
            
            if(getLastWeekDonation()>=12){
                return "Yes";}
            else{
                int weekRemaining=12-getLastWeekDonation();
                return "You have to wait for " +weekRemaining +" week(s) before donating again";}}
        
        else{
            return "No (Unfit due to age/weight)";}
        
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

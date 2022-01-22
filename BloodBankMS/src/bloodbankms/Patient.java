package bloodbankms;

public class Patient extends User{
    
    
    
<<<<<<< Updated upstream
    public Patient(String id, String password, String name, int age, int weight, String bloodGroup){
        super(id, password, name, age, weight, bloodGroup);}
=======
    public Patient(){
        super();
    }; // For Patient GUI
    
    public String getBloodMatch(){
        return bloodMatch;}

    public void setBloodMatch(String bloodMatch){
        this.bloodMatch = bloodMatch;}
>>>>>>> Stashed changes
    
    public String checkCompatibility(String bloodGroupDonor){
        
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
        
        switch(bloodGroup){
            case "A+": if(bloodGroupDonor.equals(bloodType[0]) || bloodGroupDonor.equals(bloodType[4]) || bloodGroupDonor.equals(bloodType[1])|| bloodGroupDonor.equals(bloodType[5]))
                        return "Yes";
                       else
                        return "No";
            case "O+": if(bloodGroupDonor.equals(bloodType[1]) || bloodGroupDonor.equals(bloodType[5]))
                        return "Yes";
                       else
                        return "No";
            case "B+": if(bloodGroupDonor.equals(bloodType[2]) || bloodGroupDonor.equals(bloodType[6]) || bloodGroupDonor.equals(bloodType[1])|| bloodGroupDonor.equals(bloodType[5]))
                        return "Yes";
                       else
                        return "No";
            case "AB+": if(bloodGroupDonor.equals(bloodType[0]) || bloodGroupDonor.equals(bloodType[1]) || bloodGroupDonor.equals(bloodType[2]) || bloodGroupDonor.equals(bloodType[3]) || bloodGroupDonor.equals(bloodType[4]) || bloodGroupDonor.equals(bloodType[5]) || bloodGroupDonor.equals(bloodType[6])|| bloodGroupDonor.equals(bloodType[7]))
                        return "Yes";
                       else
                        return "No";            
            case "A-": if(bloodGroupDonor.equals(bloodType[4]) || bloodGroupDonor.equals(bloodType[5]))
                        return "Yes";
                       else
                        return "No";            
            case "O-": if(bloodGroupDonor.equals(bloodType[5]))
                        return "Yes";
                       else
                        return "No";            
            case "B-": if(bloodGroupDonor.equals(bloodType[6]) || bloodGroupDonor.equals(bloodType[5]))
                        return "Yes";
                       else
                        return "No";            
            case "AB-": if(bloodGroupDonor.equals(bloodType[7]) || bloodGroupDonor.equals(bloodType[4]) || bloodGroupDonor.equals(bloodType[6]) || bloodGroupDonor.equals(bloodType[5]))
                        return "Yes";
                       else
                        return "No";            
            default: return "No";}
        
    }
    
}

package bloodbankms;

public class Patient extends User{
    
    private String bloodMatch;
    
    public Patient(String id, String password, String name, String gender, int age, float weight, String bloodGroup, Hospital hospital){
        super(id, password, name, gender, age, weight, bloodGroup, hospital);}
    
    public String getBloodMatch(){
        return bloodMatch;}

    public void setBloodMatch(String bloodMatch){
        this.bloodMatch = bloodMatch;}
    
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
            case "A+": setBloodMatch("A");
                       if(bloodGroupDonor.equals(bloodType[0]) || bloodGroupDonor.equals(bloodType[4]) || bloodGroupDonor.equals(bloodType[1])|| bloodGroupDonor.equals(bloodType[5]))
                        return "Yes";
                       else
                        return "No";
            case "O+": setBloodMatch("A");
                       if(bloodGroupDonor.equals(bloodType[1]) || bloodGroupDonor.equals(bloodType[5]))
                        return "Yes";
                       else
                        return "No";
            case "B+": setBloodMatch("A");
                       if(bloodGroupDonor.equals(bloodType[2]) || bloodGroupDonor.equals(bloodType[6]) || bloodGroupDonor.equals(bloodType[1])|| bloodGroupDonor.equals(bloodType[5]))
                        return "Yes";
                       else
                        return "No";
            case "AB+": setBloodMatch("A");
                       if(bloodGroupDonor.equals(bloodType[0]) || bloodGroupDonor.equals(bloodType[1]) || bloodGroupDonor.equals(bloodType[2]) || bloodGroupDonor.equals(bloodType[3]) || bloodGroupDonor.equals(bloodType[4]) || bloodGroupDonor.equals(bloodType[5]) || bloodGroupDonor.equals(bloodType[6])|| bloodGroupDonor.equals(bloodType[7]))
                        return "Yes";
                       else
                        return "No";            
            case "A-": setBloodMatch("A");
                       if(bloodGroupDonor.equals(bloodType[4]) || bloodGroupDonor.equals(bloodType[5]))
                        return "Yes";
                       else
                        return "No";            
            case "O-": setBloodMatch("A");
                       if(bloodGroupDonor.equals(bloodType[5]))
                        return "Yes";
                       else
                        return "No";            
            case "B-": setBloodMatch("A");
                       if(bloodGroupDonor.equals(bloodType[6]) || bloodGroupDonor.equals(bloodType[5]))
                        return "Yes";
                       else
                        return "No";            
            case "AB-": setBloodMatch("A");
                       if(bloodGroupDonor.equals(bloodType[7]) || bloodGroupDonor.equals(bloodType[4]) || bloodGroupDonor.equals(bloodType[6]) || bloodGroupDonor.equals(bloodType[5]))
                        return "Yes";
                       else
                        return "No";            
            default: return "No";}
        
    }

}

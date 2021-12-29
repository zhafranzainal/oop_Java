package bloodbankms;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class BloodBankMS{

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        String dateNotation = "dd-MM-yyyy";
        String dateCurrent = new SimpleDateFormat(dateNotation).format(new Date());
        char userChoice;
        int userExit;
                
        //Array
        Hospital hospital[] = new Hospital[7];
        User user[] = new User[20];
        
        hospital[0] = new Hospital(null, null, null, new BloodBank());
        hospital[1] = new Hospital("Selangor", "Kajang Hospital               ", "Public", new BloodBank());
        hospital[2] = new Hospital("Selangor", "Ampang Hospital               ", "Public", new BloodBank());
        hospital[3] = new Hospital("Selangor", "KPJ Kajang Specialist Hospital", "Private", new BloodBank());
        hospital[4] = new Hospital("Johor   ", "Sultanah Aminah Hospital      ", "Public", new BloodBank());
        hospital[5] = new Hospital("Johor   ", "Columbia Asia Hospital        ", "Private", new BloodBank());
        hospital[6] = new Hospital("Penang  ", "Island Hospital               ", "Private", new BloodBank());
        
        //Parent class reference to child object
        user[0] = new Donor("piya", "aloha", "Sofhia", "F", 66, 45.1f, "B+", hospital[0], 2, 1, 12);
        user[1] = new Patient("lisa", "sasa", "Malisa", "F", 21, 44.2f, "A+", hospital[0]);
        user[2] = new Donor("mary", "stethometer", "Maria", "F", 98, 24.1f, "B+", hospital[0], 2, 1, 12);
        user[3] = new Donor("shaz", "materteral", "Shazlien Chin", "F", 67, 45.1f, "B+", hospital[0], 2, 1, 12);
        user[4] = new Donor("carr", "muciferous", "Carrie Siu", "F", 76, 75.1f, "B+", hospital[0], 2, 1, 12);
        user[5] = new Donor("izz", "windbound", "Izzani", "M", 84, 68.1f, "B+", hospital[0], 2, 1, 12);
        user[6] = new Donor("letchum", "vespertilian", "Mahaletchumy", "F", 66, 45.1f, "B+", hospital[0], 2, 1, 12);
        user[7] = new Donor("jane", "hygiology", "Janet", "F", 34, 45.1f, "B+", hospital[0], 2, 1, 12);
        user[8] = new Donor("hender", "killock", "Henderson", "M", 47, 45.1f, "B+", hospital[0], 2, 1, 12);
        user[9] = new Donor("teresa", "hypolimnion", "Teresa Koay", "F", 76, 45.1f, "B+", hospital[0], 2, 1, 12);
        user[10] = new Donor("lyssa", "obelisk", "Alyssa Norzamri", "F", 54, 45.1f, "B+", hospital[0], 2, 1, 12);
        user[11] = new Donor("pijah", "roodge", "Hafezah Loi", "F", 47, 45.1f, "B+", hospital[0], 2, 1, 12);
        user[12] = new Donor("rach", "pultaceous", "Rachel Zizi", "F", 49, 45.1f, "B+", hospital[0], 2, 1, 12);
        user[13] = new Donor("tehah", "ontography", "Nurfatehah Lee", "F", 67, 45.1f, "B+", hospital[0], 2, 1, 12);
        
        //downCasting
        Donor userDonor = (Donor) user[0];
        Patient userPatient = (Patient) user[1];
        
        System.out.println("=================================================");
        System.out.println("|                                               |");
        System.out.println("|        ------------------------------         |");
        System.out.println("|         BLOOD BANK MANAGEMENT SYSTEM          |");
        System.out.println("|        ------------------------------         |");
	
        System.out.print("|        User ID  : ");
        user[0].setId(input.nextLine());
            
        System.out.print("|        Password : ");
        user[0].setId(input.nextLine());
        
        System.out.println("=================================================");
        
        System.out.println("\nPress Enter to continue...");
        try{
            System.in.read();}  
        catch(Exception e){}
        
        System.out.print("List of Hospitals\t\t\t State\t\t Sector\t Blood Stocks");
        
        for(int loop=1;loop<hospital.length;loop++){
            System.out.printf("\n%d. %s\t %s\t %s", loop, hospital[loop].getName(), hospital[loop].getState(), hospital[loop].getSector());}

        System.out.print("\n\nEnter hospital: ");
        
        //do...while loop (begin)
        do{
        System.out.println("\n\n[-----------BBMS Menu-----------]");
        System.out.println("A - Donate Blood");
        System.out.println("B - Receive Blood");
        System.out.println("D - Display Blood");
        System.out.println("H - Help/Information");
        System.out.println("X - Exit");

        System.out.print("\nEnter choice: ");
        userChoice=input.next().charAt(0);
        input.nextLine();
        
        userChoice=Character.toUpperCase(userChoice);
        
        if(userChoice=='A'){
            System.out.print("\nEnter name            : ");
            user[0].setName(input.nextLine());
            System.out.print("Enter gender [M/F]    : ");
            user[0].setGender(input.next());
            System.out.print("Enter age             : ");
            user[0].setAge(input.nextInt());
            System.out.print("Enter weight (kg)     : ");
            user[0].setWeight(input.nextFloat());
            System.out.println("\n\t**Blood Group** \n[A+/ O+/ B+/ AB+/ A-/ O-/ B-/ AB-]");
            
            //prompt error
            for(;;){
            System.out.print("\nEnter blood group                     : ");
            user[0].setBloodGroup(input.next());
            
            if(user[0].getBloodGroup().equals("A+") || user[0].getBloodGroup().equals("O+") || user[0].getBloodGroup().equals("B+") || user[0].getBloodGroup().equals("AB+") || user[0].getBloodGroup().equals("A-") || user[0].getBloodGroup().equals("O-") || user[0].getBloodGroup().equals("B-") || user[0].getBloodGroup().equals("AB-")){
                break;}
            
            System.out.println("\nERROR! Please only insert one of available 8 blood groups (all CAPS).");}
            
            System.out.print("Healthy? [Yes=1, No=2]                : ");
            userDonor.setHealthStatus(input.nextInt());
            System.out.print("Private name? [Yes=1, No=2]           : ");
            userDonor.setAnonymity(input.nextInt());
            System.out.print("Enter nth week since last donation    : ");
            userDonor.setLastWeekDonation(input.nextInt());}
        
        else if(userChoice=='H'){
            hospital[0].infoEligibility();}
        
        System.out.println("\nDATE: " +dateCurrent);
        
        System.out.printf("\nDonor               : %s(%d)", user[0].getName(), user[0].getAge());
        System.out.println("\nBlood Group         : " +user[0].bloodGroup);
        System.out.println("Donate Blood To     : " +userDonor.checkRecipient());
        System.out.printf("Weight              : %.2fkg", user[0].getWeight());
        System.out.println("\nEligibility         : " +userDonor.checkEligibilty());
        
        System.out.printf("\nRecipient           : %s(%d)", user[1].getName(), user[1].getAge());
        System.out.println("\nBlood Group         : " +user[1].bloodGroup);
        System.out.printf("Receive Blood From  : %s(%s)", user[0].getName(), user[0].bloodGroup);
        System.out.println("\nBlood Compatibility : " +userPatient.getBloodMatch());
        System.out.println("Compatibility       : " +userPatient.checkCompatibility(user[0].bloodGroup));
                
        System.out.print("\nContinue? [Yes=1, Exit=2]: ");
        userExit=input.nextInt();

        //do...while loop (end)
        }while(userExit==1);
    }
}

package bloodbankms;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class BloodBankMS{

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        String dateNotation = "dd-MM-yyyy";
        String dateCurrent = new SimpleDateFormat(dateNotation).format(new Date());
        String searchedBlood;
        char userChoice;
        int userExit, loopNo, chosenHospital;
                
        //Array
        Hospital hospital[] = new Hospital[7];
        User user[] = new User[14];
        
        UserFactory factUser = new UserFactory();
        User userMain = null;
        
        hospital[0] = new Hospital(null, null, null, new BloodBank());
        hospital[1] = new Hospital("Selangor", "Kajang Hospital               ", "Public ", new BloodBank());
        hospital[2] = new Hospital("Selangor", "Ampang Hospital               ", "Public ", new BloodBank());
        hospital[3] = new Hospital("Selangor", "KPJ Kajang Specialist Hospital", "Private", new BloodBank());
        hospital[4] = new Hospital("Johor   ", "Sultanah Aminah Hospital      ", "Public ", new BloodBank());
        hospital[5] = new Hospital("Johor   ", "Columbia Asia Hospital        ", "Private", new BloodBank());
        hospital[6] = new Hospital("Penang  ", "Island Hospital               ", "Private", new BloodBank());
        
        //Parent class reference to child object
        user[0] = new Patient("lisa", "sasa", "Malisa", "F", 21, 44.2f, "A+", hospital[0]);
        user[1] = new Donor("piya", "aloha", "Sofhia", "F", 66, 45.1f, "B+", hospital[0], 2, 1, 12);
        user[2] = new Donor("mary", "stethometer", "Maria", "F", 98, 24.1f, "A+", hospital[0], 2, 1, 12);
        user[3] = new Donor("shaz", "materteral", "Shazlien Chin", "F", 67, 45.1f, "B+", hospital[0], 2, 1, 12);
        user[4] = new Donor("carr", "muciferous", "Carrie Siu", "F", 76, 75.1f, "AB+", hospital[0], 2, 1, 12);
        user[5] = new Donor("izz", "windbound", "Izzani", "M", 84, 68.1f, "O+", hospital[0], 2, 1, 12);
        user[6] = new Donor("letchum", "vespertilian", "Mahaletchumy", "F", 66, 45.1f, "A-", hospital[0], 2, 1, 12);
        user[7] = new Donor("jane", "hygiology", "Janet", "F", 34, 45.1f, "O-", hospital[0], 2, 1, 12);
        user[8] = new Donor("hender", "killock", "Henderson", "M", 47, 45.1f, "B-", hospital[0], 2, 1, 12);
        user[9] = new Donor("teresa", "hypolimnion", "Teresa Koay", "F", 76, 45.1f, "AB-", hospital[0], 2, 1, 12);
        user[10] = new Donor("lyssa", "obelisk", "Alyssa Norzamri", "F", 54, 45.1f, "B+", hospital[0], 2, 1, 12);
        user[11] = new Donor("pijah", "roodge", "Hafezah Loi", "F", 47, 45.1f, "B+", hospital[0], 2, 1, 12);
        user[12] = new Donor("rach", "pultaceous", "Rachel Zizi", "F", 49, 45.1f, "O+", hospital[0], 2, 1, 12);
        user[13] = new Donor("tehah", "ontography", "Nurfatehah Lee", "F", 67, 45.1f, "O-", hospital[0], 2, 1, 12);
        
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
        
        System.out.println("Country: " +HelpDesk.COUNTRY);
        System.out.print("List of Hospitals\t\t\t State\t\t Sector\t\t");
        
        for(int loop=1;loop<hospital.length;loop++){
            System.out.printf("\n%d. %s\t %s\t %s\t", loop, hospital[loop].getName(), hospital[loop].getState(), hospital[loop].getSector());}
        
        System.out.print("\n\nEnter hospital no. you want to be registered: ");
        chosenHospital=input.nextInt();
        
        if(chosenHospital==1){
            user[0].getHospital().setName("Kajang Hospital               ");}
        else if(chosenHospital==2){
            user[0].getHospital().setName("Ampang Hospital               ");}
        else if(chosenHospital==3){
            user[0].getHospital().setName("KPJ Kajang Specialist Hospital");}
        else if(chosenHospital==4){
            user[0].getHospital().setName("Sultanah Aminah Hospital      ");}
        else if(chosenHospital==5){
            user[0].getHospital().setName("Columbia Asia Hospital        ");}
        else if(chosenHospital==6){
            user[0].getHospital().setName("Island Hospital               ");}
                
        //do...while loop (begin)
        do{
        System.out.println("\n[-----------BBMS Menu-----------]");
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
            
            userMain = factUser.getUser(userChoice);
            Donor donor = (Donor) userMain;
            
            System.out.print("\nEnter name            : ");
            donor.setName(input.nextLine());
            System.out.print("Enter gender [M/F]    : ");
            donor.setGender(input.next());
            System.out.print("Enter age             : ");
            donor.setAge(input.nextInt());
            System.out.print("Enter weight (kg)     : ");
            donor.setWeight(input.nextFloat());
            System.out.println("\n\t**Blood Group** \n[A+/ O+/ B+/ AB+/ A-/ O-/ B-/ AB-]");
            
            //prompt error
            for(;;){
            System.out.print("\nEnter blood group                     : ");
            donor.setBloodGroup(input.next());
            
            if(donor.getBloodGroup().equals("A+") || donor.getBloodGroup().equals("O+") || donor.getBloodGroup().equals("B+") || donor.getBloodGroup().equals("AB+") || donor.getBloodGroup().equals("A-") || donor.getBloodGroup().equals("O-") || donor.getBloodGroup().equals("B-") || donor.getBloodGroup().equals("AB-")){
                break;}
            
            System.out.println("\nERROR! Please only insert one of available 8 blood groups (all CAPS).");}
            
            System.out.print("Healthy? [Yes=1, No=2]                : ");
            donor.setHealthStatus(input.nextInt());
            System.out.print("Private name? [Yes=1, No=2]           : ");
            donor.setAnonymity(input.nextInt());
            System.out.print("Enter nth week since last donation    : ");
            donor.setLastWeekDonation(input.nextInt());
        
            System.out.println("\nDATE: " +dateCurrent);
        
            System.out.printf("\nDonor               : %s(%d)", donor.getName(), donor.getAge());
            System.out.println("\nBlood Group         : " +donor.bloodGroup);
            System.out.println("Donate Blood To     : " +donor.checkRecipient());
            System.out.printf("Weight              : %.2fkg", donor.getWeight());
            System.out.println("\nEligibility         : " +donor.checkEligibilty());
        }
        
        else if(userChoice=='B'){
            
            userMain = factUser.getUser(userChoice);
            Patient patient = (Patient) userMain;
            
            System.out.print("\nEnter name            : ");
            patient.setName(input.nextLine());
            System.out.print("Enter gender [M/F]    : ");
            patient.setGender(input.next());
            System.out.print("Enter age             : ");
            patient.setAge(input.nextInt());
            System.out.print("Enter weight (kg)     : ");
            patient.setWeight(input.nextFloat());
            System.out.println("\n\t**Blood Group** \n[A+/ O+/ B+/ AB+/ A-/ O-/ B-/ AB-]");
            
            //prompt error
            for(;;){
            System.out.print("\nEnter blood group: ");
            patient.setBloodGroup(input.next());
            
            if(patient.getBloodGroup().equals("A+") || patient.getBloodGroup().equals("O+") || patient.getBloodGroup().equals("B+") || patient.getBloodGroup().equals("AB+") || patient.getBloodGroup().equals("A-") || patient.getBloodGroup().equals("O-") || patient.getBloodGroup().equals("B-") || patient.getBloodGroup().equals("AB-")){
                break;}
            
            System.out.println("\nERROR! Please only insert one of available 8 blood groups (all CAPS).");}
        
            System.out.println("\nDATE: " +dateCurrent);
            
            System.out.printf("\nRecipient           : %s(%d)", patient.getName(), patient.getAge());
            System.out.println("\nBlood Group         : " +patient.bloodGroup);
            System.out.printf("Receive Blood From  : %s(%s)", user[1].getName(), user[1].bloodGroup);
            System.out.println("\nBlood Compatibility : " +patient.getBloodMatch());
            System.out.println("Compatibility       : " +patient.checkCompatibility(user[1].bloodGroup));
        
        }
        
        else if(userChoice=='D'){
            
            System.out.print("\nList of Hospitals\t\t\t State\t\t Sector\t\t");
        
            for(int loop=1;loop<hospital.length;loop++){
                System.out.printf("\n%d. %s\t %s\t %s\t", loop, hospital[loop].getName(), hospital[loop].getState(), hospital[loop].getSector());}
        
            System.out.print("\n\nSearch hospital no: ");
            chosenHospital=input.nextInt();
        
            System.out.println("\n\t**Blood Group** \n[A+/ O+/ B+/ AB+/ A-/ O-/ B-/ AB-]");
            
            //prompt error
            for(;;){
                System.out.print("\nSearch blood group: ");
                searchedBlood=input.next();
            
                if(searchedBlood.equals("A+") || searchedBlood.equals("O+") || searchedBlood.equals("B+") || searchedBlood.equals("AB+") || searchedBlood.equals("A-") || searchedBlood.equals("O-") || searchedBlood.equals("B-") || searchedBlood.equals("AB-")){
                    break;}
            
                System.out.println("\nERROR! Please only insert one of available 8 blood groups (all CAPS).");}
        
            if(chosenHospital==1){
                System.out.println("\nHOSPITAL: " +hospital[1].getName());}
            else if(chosenHospital==2){
                System.out.println("\nHOSPITAL: " +hospital[2].getName());}
            else if(chosenHospital==3){
                System.out.println("\nHOSPITAL: " +hospital[3].getName());}
            else if(chosenHospital==4){
                System.out.println("\nHOSPITAL: " +hospital[4].getName());}
            else if(chosenHospital==5){
                System.out.println("\nHOSPITAL: " +hospital[5].getName());}
            else if(chosenHospital==6){
                System.out.println("\nHOSPITAL: " +hospital[6].getName());}
        
            if(searchedBlood.equals("A+")){
                System.out.printf("LIST OF DONORS (%s)", hospital[0].getBloodBank().getBlood().getBloodType1());}
            else if(searchedBlood.equals("O+")){
                System.out.printf("LIST OF DONORS (%s)", hospital[0].getBloodBank().getBlood().getBloodType2());}
            else if(searchedBlood.equals("B+")){
                System.out.printf("LIST OF DONORS (%s)", hospital[0].getBloodBank().getBlood().getBloodType3());}
            else if(searchedBlood.equals("AB+")){
                System.out.printf("LIST OF DONORS (%s)", hospital[0].getBloodBank().getBlood().getBloodType4());}
            else if(searchedBlood.equals("A-")){
                System.out.printf("LIST OF DONORS (%s)", hospital[0].getBloodBank().getBlood().getBloodType5());}
            else if(searchedBlood.equals("O-")){
                System.out.printf("LIST OF DONORS (%s)", hospital[0].getBloodBank().getBlood().getBloodType6());}
            else if(searchedBlood.equals("B-")){
                System.out.printf("LIST OF DONORS (%s)", hospital[0].getBloodBank().getBlood().getBloodType7());}
            else if(searchedBlood.equals("AB-")){
                System.out.printf("LIST OF DONORS (%s)", hospital[0].getBloodBank().getBlood().getBloodType8());}
                
            loopNo=1;
        
            for(int loop=0;loop<user.length;loop++){
            
                if(user[loop].getBloodGroup().equals(searchedBlood)){
                    System.out.printf("\n%d) %s\t\t\t", loopNo++, user[loop].getName());}
            
            }
        
            System.out.println("");
        }
        
        else if(userChoice=='H'){
            hospital[0].infoEligibility();}
                
        System.out.print("\nContinue session? [Yes=1, Confirm Exit=2]: ");
        userExit=input.nextInt();

        //do...while loop (end)
        }while(userExit==1);
        
        System.out.println("You have successfully logged out from Blood Bank Management System (BBMS)");
        System.out.println("");
    }
}

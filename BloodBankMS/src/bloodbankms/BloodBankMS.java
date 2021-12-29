package bloodbankms;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class BloodBankMS{

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        String dateNotation = "dd-MM-yyyy";
        String dateCurrent = new SimpleDateFormat(dateNotation).format(new Date());
        
        //Array
        User user[] = new User[10];
        
        //Parent class reference to child object
        user[0] = new Donor("CB20033", "aloha", "Sofhia", 66, 45, "B+", 12);
        user[1] = new Patient("FA10021", "sasa", "Malisa", 21, 44, "A+");
        
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
                
        System.out.println("[-----------BBMS Menu-----------]");
        System.out.println("A - Donate Blood");
        System.out.println("B - Receive Blood");
        System.out.println("D - Display Blood");
        System.out.println("X - Exit");

        System.out.println("\nEnter choice: ");
        
        System.out.println("\nDATE: " +dateCurrent);
        
        System.out.printf("\nDonor               : %s(%d)", user[0].getName(), user[0].getAge());
        System.out.println("\nBlood Group         : " +user[0].bloodGroup);
        System.out.println("Donate Blood To     : " +userDonor.checkRecipient());
        System.out.println("Weight              : " +user[0].getWeight());
        System.out.println("Eligibility         : " +userDonor.checkEligibilty());
        
        System.out.printf("\nRecipient           : %s(%d)", user[1].getName(), user[1].getAge());
        System.out.println("\nBlood Group         : " +user[1].bloodGroup);
        System.out.printf("Receive Blood From  : %s(%s)", user[0].getName(), user[0].bloodGroup);
        System.out.println("\nBlood Compatibility : " +userPatient.getBloodMatch());
        System.out.println("Compatibility       : " +userPatient.checkCompatibility(user[0].bloodGroup));
        
        System.out.println("");
    }
}

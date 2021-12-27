package bloodbankms;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class BloodBankMS{

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        String pattern = "dd-MM-yyyy";
        String dateInString = new SimpleDateFormat(pattern).format(new Date());
        
        //Array
        User user[] = new User[10];
        
        //Parent class reference to child object
        user[0] = new Donor("CB20033", "aloha", "Sofhia", 66, 45, "B+", 12);
        user[1] = new Patient("FA10021", "sasa", "Malisa", 21, 44, "A+");
        
        //downCasting
        Donor userDonor = (Donor) user[0];
        Patient userPatient = (Patient) user[1];
        
        System.out.println("[-----------BBMS Menu-----------]");
        System.out.println("A - Want to donate");
        System.out.println("B - Looking for blood");
        System.out.println("X - Exit");

        System.out.println("\nEnter choice: ");
        
        System.out.println("\nDATE: " +dateInString);
        
        System.out.printf("\nDonator             : %s(%d)", user[0].getName(), user[0].getAge());
        System.out.println("\nBlood Group         : " +user[0].bloodGroup);
        System.out.println("Donate Blood To     : " +userDonor.checkRecipient());
        System.out.println("Eligibilty          : " +userDonor.checkEligibilty());
        
        System.out.printf("\nRecipient           : %s(%d)", user[1].getName(), user[1].getAge());
        System.out.println("\nBlood Group         : " +user[1].bloodGroup);
        System.out.printf("Receive Blood From  : %s(%s)", user[0].getName(), user[0].bloodGroup);
        System.out.println("\nCompatibility       : " +userPatient.checkCompatibility(user[0].bloodGroup));
        
        System.out.println("");
    }
}

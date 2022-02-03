package staffincomereport;

import java.util.Scanner;

public class StaffIncomeReport{
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        String name = "";
        String id = "";
        String incomeType = "";
        double amount = 0;
        double tax = 0;
        
        System.out.print("Please enter the Staff NAME                     : ");
        name=input.nextLine();
        
        System.out.print("Please enter the Staff ID                       : ");
        id=input.nextLine();
        
        System.out.print("Please enter the Staff INCOME TYPE              : ");
        incomeType=input.nextLine();
        
        System.out.print("Please enter the Staff INCOME AMOUNT            : ");
        amount=input.nextDouble();
        
        System.out.print("Please enter the Staff INCOME TAX PERCENTAGE    : ");
        tax=input.nextDouble();
        
        Staff staff = new Staff(name, id, new Income(incomeType, amount, tax));
        
        staff.displayStaffInfo();
        staff.displayIncomeInfo();
        
        System.out.println("");
        
    }
    
}

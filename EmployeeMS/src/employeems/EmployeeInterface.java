package employeems;

import java.util.Scanner;
import java.text.DecimalFormat;

public class EmployeeInterface{

    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int empType;
        
        //Array
        Employee employee[] = new Employee[2];
        
        //Parent class reference to child object
        employee[0] = new FullTimeEmployee();
        employee[1] = new PartTimeEmployee();
        
        //downCasting
        FullTimeEmployee empFt = (FullTimeEmployee) employee[0];
        PartTimeEmployee empPt = (PartTimeEmployee) employee[1];
        
        System.out.print("Please select your mode (0=Full Time; 1=Part Time): ");
        empType=input.nextInt();
        
        if(empType==0){
            
            System.out.println("\nYou are FULL TIME EMPLOYEE");
            System.out.print("Please enter your salary              : ");
            empFt.setSalary(input.nextDouble());
        
            System.out.print("Please enter your year of employment  : ");
            empFt.setNumOfYearEmployed(input.nextInt());
            input.nextLine();
            
            System.out.print("Please enter employee number          : ");
            employee[0].setEmpNo(input.nextLine());
        
            System.out.print("Please enter employee name            : ");
            employee[0].setName(input.nextLine());
        
            System.out.println("\nDISPLAYING RECORD FOR FULL TIME EMPLOYEE");
            System.out.println("Employee Number         : " +employee[0].getEmpNo());
            System.out.println("Employee Name           : " +employee[0].getName());
            System.out.println("Employee Total Payment  : RM" +df.format(empFt.computeTotalPayment()));}
        
        else{
            
            System.out.println("\nYou are PART TIME EMPLOYEE");
            System.out.print("Please enter number of hours worked   : ");
            empPt.setNumberHourWork(input.nextInt());
            input.nextLine();
        
            System.out.print("Please enter employee number          : ");
            employee[1].setEmpNo(input.nextLine());
        
            System.out.print("Please enter employee name            : ");
            employee[1].setName(input.nextLine());
                
            System.out.println("\nDISPLAYING RECORD FOR PART TIME EMPLOYEE");
            System.out.println("Employee Number         : " +employee[1].getEmpNo());
            System.out.println("Employee Name           : " +employee[1].getName());
            System.out.println("Employee Total Payment  : RM" +df.format(empPt.computeTotalPayment()));}
        
        System.out.println("");
    }
}

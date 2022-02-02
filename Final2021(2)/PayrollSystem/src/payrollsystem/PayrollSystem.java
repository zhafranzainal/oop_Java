package payrollsystem;

import java.util.ArrayList;

public class PayrollSystem{

    public static void main(String[] args){
        
        //Parent class reference to child object
        Employee emp1 = new SalariedEmployee("James", "Watt", "771014-03-9003", 2600);
        Employee emp2 = new CommissionEmployee("Mohit", "Sharma", "891209-13-9005", 10000, 0.07);
        Employee emp3 = new BasePlusCommissionEmployee("Kim", "Wong", "850521-10-9006", 5000, 0.04, 1200);
        
        //Create an array list
        ArrayList<Employee> employee = new ArrayList<>();
        
        //Add elements to an array list (implement polymorphism)
        employee.add(emp1);
        employee.add(emp2);
        employee.add(emp3);
        
        for(Employee obj:employee){
            System.out.print(obj.displayInfo());}
        
        System.out.println("");
        
    }
    
}

package payrollsystem;

import java.util.ArrayList;

public class PayrollSystem{

    public static void main(String[] args){
        
        //Parent class reference to child object
        Employee emp1 = new SalariedEmployee("Mohd Akmal", "801123-10-5749", 2400);
        Employee emp2 = new CommissionEmployee("Sanjay Menon", "870314-02-5507", 10000, 0.06);
        Employee emp3 = new BasePlusCommissionEmployee("Siti Saifudin", "900128-14-7862", 5000, 0.04, 1200);
        
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

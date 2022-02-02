package payrollsystem;

import java.util.ArrayList;
import java.text.NumberFormat;
import java.util.Locale;

public class PayrollSystem{

    public static void main(String[] args){
        
        NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);        
        
        //Parent class reference to child object
        Employee emp1 = new SalariedEmployee("James", "Watt", "771014-03-9003", 2600);
        Employee emp2 = new CommissionEmployee("Mohit", "Sharma", "891209-13-9005", 10000, 0.07);
        Employee emp3 = new BasePlusCommissionEmployee("Kim", "Wong", "850521-10-9006", 5000, 0.04, 1200);
        
        //Downcasting
        SalariedEmployee empSalaried = (SalariedEmployee) emp1;
        CommissionEmployee empComm = (CommissionEmployee) emp2;
        BasePlusCommissionEmployee empBaseComm = (BasePlusCommissionEmployee) emp3;
        
        System.out.printf("Salaried employee   : %s %s", empSalaried.getNameFirst(), empSalaried.getNameLast());
        System.out.println("\nMyKad               : " +empSalaried.getMyKad());
        System.out.println("Monthly salary      : " +formatter.format(empSalaried.getMonthlySalary()));
        System.out.println("Earned              : " +formatter.format(empSalaried.getEarnings()));
        
        System.out.printf("\nCommission employee : %s %s", empComm.getNameFirst(), empComm.getNameLast());
        System.out.println("\nMyKad               : " +empComm.getMyKad());
        System.out.println("Gross sales         : " +formatter.format(empComm.getGrossSales()));
        System.out.println("Commission rate     : " +empComm.getCommissionRate());
        System.out.println("Earned              : " +formatter.format(empComm.getEarnings()));
        
        System.out.printf("\nBase-salaried Commission employee   : %s %s", empBaseComm.getNameFirst(), empBaseComm.getNameLast());
        System.out.println("\nMyKad                               : " +empBaseComm.getMyKad());
        System.out.println("Gross sales                         : " +formatter.format(empBaseComm.getGrossSales()));
        System.out.println("Commission rate                     : " +empBaseComm.getCommissionRate());
        System.out.println("Base salary                         : " +formatter.format(empBaseComm.getBaseSalary()));
        System.out.println("New base salary (10% increase)      : " +formatter.format(empBaseComm.getBaseSalary()*1.1));
        
        empBaseComm.setBaseSalary(empBaseComm.getBaseSalary()*1.1);
        
        System.out.println("Earned                              : " +formatter.format(empBaseComm.getEarnings()));
        
        System.out.println("");
        
    }
    
}

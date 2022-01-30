package employeeincomesystem;

import java.text.DecimalFormat;

public class EmployeeIncomeSystem{

    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    public static void main(String[] args){
        
        Employee emp1 = new Technician("CT23100");
        Employee emp2 = new ProductionOperator("CP21001");
        
        System.out.println("EMPLOYEE INCOME INFORMATION");
        
        System.out.println("\nTECHNICIAN");
        System.out.println("Technician ID           : " +emp1.getStaffID());
        System.out.println("Salary                  : RM" +df.format(emp1.calculateSalary()));
        System.out.print("Monthly Income          : RM");
        emp1.computeMonthlyIncome();
        
        System.out.println("");
        
        System.out.println("\nPRODUCTION OPERATOR");
        System.out.println("Production Operator ID  : " +emp2.getStaffID());
        System.out.println("Salary                  : RM" +df.format(emp2.calculateSalary()));
        System.out.print("Monthly Income          : RM");
        emp2.computeMonthlyIncome();

        System.out.println("\n");
    }
    
}

package constructioncompany;

import java.text.DecimalFormat;

public class UbaiConstMain{
    
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args){
        
        Employee emp[] = new Employee[10];
        
        for(int loop=0;loop<emp.length;loop++){
            
            if(loop<5){
                emp[loop] = new PermanentEmployee(2500, 10);
                System.out.print("" +(loop+1) +". ");
                System.out.println("Total Payment: RM" +df.format(emp[loop].computeTotalPayment()));
                System.out.println("");}
            
            else{
                emp[loop] = new ContractEmployee(10);
                System.out.print("" +(loop+1) +". ");
                System.out.println("Total Payment: RM" +df.format(emp[loop].computeTotalPayment()));
                System.out.println("");}
            
        }
                
    }   
}

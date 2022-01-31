package incomereport;

import java.text.DecimalFormat;

public class Staff{
    
    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    private String name;
    private String id;
    private Income income;
    
    public Staff(String name, String id, Income income){
        this.name=name;
        this.id=id;
        this.income=income;}

    public String getName(){
        return name;}

    public String getId(){
        return id;}
    
    public double calculateNetIncome(){        
        return income.getAmount()-income.getTotalTax();}
    
    public void displayStaffInfo(){
        System.out.println("--------------------------------------------------------");
        System.out.println("STAFF INCOME REPORT");
        System.out.printf("\nStaff Name: %s\t Staff ID: %s", getName(), getId());}
    
    public void displayIncomeInfo(){
        System.out.println("\n\nIncome Type:\t Income Amount:\t Tax:");
        System.out.printf("%s\t\t %.2f\t\t %.1f%%", income.getIncomeType(), income.getAmount(), income.getTax());
        System.out.println("\n\nTotal Tax Paid      : RM" +df.format(income.getTotalTax()));
        System.out.println("Total Net Income    : RM" +df.format(calculateNetIncome()));}
    
}

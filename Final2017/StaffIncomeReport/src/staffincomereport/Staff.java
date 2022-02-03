package staffincomereport;

import java.text.NumberFormat;

public class Staff{
    
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    
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
        System.out.print("" +income.getIncomeType() +"\t\t " +formatter.format(income.getAmount()) +"\t\t " +income.getTax() +"%");
        System.out.println("\n\nTotal Tax Paid      : " +formatter.format(income.getTotalTax()));
        System.out.println("Total Net Income    : " +formatter.format(calculateNetIncome()));}
    
}

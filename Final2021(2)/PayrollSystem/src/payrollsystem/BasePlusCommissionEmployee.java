package payrollsystem;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    
    private double baseSalary;
    
    public BasePlusCommissionEmployee(String nameFirst, String nameLast, String myKad, double grossSales, double commissionRate, double baseSalary){
        super(nameFirst, nameLast, myKad, grossSales, commissionRate);
        this.baseSalary=baseSalary;}

    public double getBaseSalary(){
        return baseSalary;}

    public void setBaseSalary(double baseSalary){
        this.baseSalary = baseSalary;}
    
    @Override
    public String displayInfo(){
        
        System.out.printf("\nBase-salaried Commission employee   : %s %s", getNameFirst(), getNameLast());
        System.out.println("\nMyKad                               : " +getMyKad());
        System.out.println("Gross sales                         : " +formatter.format(getGrossSales()));
        System.out.println("Commission rate                     : " +getCommissionRate());
        System.out.println("Base salary                         : " +formatter.format(getBaseSalary()));
        System.out.println("New base salary (10% increase)      : " +formatter.format(getBaseSalary()*1.1));
        
        setBaseSalary(getBaseSalary()*1.1);
        
        System.out.println("Earned                              : " +formatter.format(getEarnings()));
        
        return "";}
    
    @Override
    public double getEarnings(){
        return super.getEarnings()+getBaseSalary();}
    
}

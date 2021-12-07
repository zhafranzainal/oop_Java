package employeems;

public class Employee{
    
    protected String empNo;
    protected String name;
    protected double totalPayment;
    
    public Employee(){}
    
    public double computeTotalPayment(){
        return totalPayment;}

    public String getEmpNo(){
        return empNo;}

    public void setEmpNo(String empNo){
        this.empNo = empNo;}

    public String getName(){
        return name;}

    public void setName(String name){
        this.name = name;}

    public double getTotalPayment(){
        return totalPayment;}

    public void setTotalPayment(double totalPayment){
        this.totalPayment = totalPayment;}
    
}

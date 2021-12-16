package employeems;

public class Employee{
    
    protected String empNo;
    protected String name;
    protected double totalPayment;
    
    public Employee(String empNo, String name, double totalPayment){
        this.empNo=empNo;
        this.name=name;
        this.totalPayment=totalPayment;}
    
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
    
}

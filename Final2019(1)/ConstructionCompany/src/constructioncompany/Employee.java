package constructioncompany;

abstract public class Employee{
    
    protected String empNo;
    protected String branch;
    protected float totalPayment;
    
    public float computeTotalPayment(){
        return 0;}

    public void setEmpNo(String empNo){
        this.empNo = empNo;}

    public void setBranch(String branch){
        this.branch = branch;}

    public void setTotalPayment(float totalPayment){
        this.totalPayment = totalPayment;}
    
    public String getEmpNo(){
        return empNo;}

    public String getBranch(){
        return branch;}

    public float getTotalPayment(){
        return totalPayment;}
    
}

package bloodbankms;

public class Hospital implements HelpDesk{
    
    private String state;
    private String name;
    private String sector;
    private BloodBank bloodBank;
    
    public Hospital(String state, String name, String sector, BloodBank bloodBank){
        this.state=state;
        this.name=name;
        this.sector=sector;
        this.bloodBank=bloodBank;}
    
    public String getState(){
        return state;}

    public void setState(String state){
        this.state = state;}

    public String getName(){
        return name;}

    public void setName(String name){
        this.name = name;}

    public String getSector(){
        return sector;}

    public void setSector(String sector){
        this.sector = sector;}

    public BloodBank getBloodBank(){
        return bloodBank;}

    public void setBloodBank(BloodBank bloodBank){
        this.bloodBank = bloodBank;}
    
    @Override
    public void infoEligibility(){
        System.out.println("\nYou can only donate if:-");
        System.out.println("a) Your age is above 18 or below 65.");
        System.out.println("b) You are 45kg and above.");
        System.out.println("c) You are in good health condition.");
        System.out.println("d) Your blood donation does not exceed once in every 3 months.");}
    
}

package bloodbankms;

public class BloodBank{
    
    private Blood blood;
    private int bloodStock;
    
    public BloodBank(){
        blood = new Blood();
        bloodStock=0;}

    public Blood getBlood(){
        return blood;}

    public void setBlood(Blood blood){
        this.blood = blood;}

    public int getBloodStock(){
        return bloodStock;}

    public void setBloodStock(int bloodStock){
        this.bloodStock = bloodStock;}
    
}

package mykadapp;

public class MyKad{
    
    private String mykadNumber;
    
    public MyKad(){}
    
    public void setMykadNumber(String mykadNumber){
        this.mykadNumber = mykadNumber;}
    
    public int getDay(){        
        return Integer.parseInt(mykadNumber.substring(4,6));}
    
    public String getMonth(){
        
        //Array
        String month[] = new String[12];
        
        month[0]="January";
        month[1]="February";
        month[2]="March";
        month[3]="April";
        month[4]="May";
        month[5]="June";
        month[6]="July";
        month[7]="August";
        month[8]="September";
        month[9]="October";
        month[10]="November";
        month[11]="Disember";
        
        if(mykadNumber.substring(2,4).equals("01")){
            return month[0];}
        
        else if(mykadNumber.substring(2,4).equals("02")){
            return month[1];}
        
        else if(mykadNumber.substring(2,4).equals("03")){
            return month[2];}
        
        else if(mykadNumber.substring(2,4).equals("04")){
            return month[3];}
        
        else if(mykadNumber.substring(2,4).equals("05")){
            return month[4];}
        
        else if(mykadNumber.substring(2,4).equals("06")){
            return month[5];}
                
        else if(mykadNumber.substring(2,4).equals("07")){
            return month[6];}
        
        else if(mykadNumber.substring(2,4).equals("08")){
            return month[7];}
        
        else if(mykadNumber.substring(2,4).equals("09")){
            return month[8];}
        
        else if(mykadNumber.substring(2,4).equals("10")){
            return month[9];}
                
        else if(mykadNumber.substring(2,4).equals("11")){
            return month[10];}
        
        else{
            return month[11];}
    }
    
    public String getYear(){
        
        String s=mykadNumber.substring(0,2);
        
        if(Integer.parseInt(s)<=21){
            return "20"+s;}
        
        else{
            return "19"+s;}
    }
    
    public String getPOB(){
        
        //Array
        String POB[] = new String[17];
        
        POB[0]="N/A";
        POB[1]="Johor";        
        POB[2]="Kedah";        
        POB[3]="Kelantan";        
        POB[4]="Malacca";        
        POB[5]="Negeri Sembilan";        
        POB[6]="Pahang";
        POB[7]="Penang";
        POB[8]="Perak";
        POB[9]="Perlis";
        POB[10]="Selangor";
        POB[11]="Terengganu";
        POB[12]="Sabah";
        POB[13]="Sarawak";
        POB[14]="Federal Territory of Kuala Lumpur";
        POB[15]="Federal Territory of Labuan";
        POB[16]="Federal Territory of Putrajaya";
        
        if(mykadNumber.substring(6,8).equals("00")){
            return POB[0];}
        
        else if(mykadNumber.substring(6,8).equals("01")){
            return POB[1];}
        
        else if(mykadNumber.substring(6,8).equals("02")){
            return POB[2];}
        
        else if(mykadNumber.substring(6,8).equals("03")){
            return POB[3];}
        
        else if(mykadNumber.substring(6,8).equals("04")){
            return POB[4];}
        
        else if(mykadNumber.substring(6,8).equals("05")){
            return POB[5];}
        
        else if(mykadNumber.substring(6,8).equals("06")){
            return POB[6];}
        
        else if(mykadNumber.substring(6,8).equals("07")){
            return POB[7];}
        
        else if(mykadNumber.substring(6,8).equals("08")){
            return POB[8];}
        
        else if(mykadNumber.substring(6,8).equals("09")){
            return POB[9];}
        
        else if(mykadNumber.substring(6,8).equals("10")){
            return POB[10];}
        
        else if(mykadNumber.substring(6,8).equals("11")){
            return POB[11];}
        
        else if(mykadNumber.substring(6,8).equals("12")){
            return POB[12];}
        
        else if(mykadNumber.substring(6,8).equals("13")){
            return POB[13];}
        
        else if(mykadNumber.substring(6,8).equals("14")){
            return POB[14];}
        
        else if(mykadNumber.substring(6,8).equals("15")){
            return POB[15];}
        
        else{
            return POB[16];}
    }
    
    public String getGender(){
        
        if(Character.getNumericValue(mykadNumber.charAt(11))%2==0){
            return "Female";}
        
        else{
            return "Male";}
    }
    
}

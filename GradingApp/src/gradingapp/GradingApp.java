package gradingapp;

public class GradingApp{

    public static void main(String[] args){
        
        Student stud[] = new Student[8];

        stud[0] = new Student(25,"John Dow",'M',true,90);
        stud[1] = new Student(21,"Jane Dow",'F',true,60);
        stud[2] = new Student(23,"Will Beyoan",'M',false,39);
        stud[3] = new Student(30,"Smith C",'M',false,45);
        stud[4] = new Student(19,"John Wick ",'M',false,12);
        stud[5] = new Student(18,"Donnal Young",'M',true,55);
        stud[6] = new Student(17,"Tavarish A",'M',false,8);
        stud[7] = new Student(27,"Isabella",'F',false,43);
        
        int loopNo, profile=0, maxAge=stud[0].getAge(), max=0, minAge=stud[0].getAge(), min=0;
        float percentPass, percentFail;
        String searchName="Donnal Young", result;
        
        //Display Array of Object
        for(int loop=0;loop<stud.length;loop++){
            
            System.out.printf("\n«« Student %d »»", loop+1);
            System.out.println("\nName    : " +stud[loop].getName());
            System.out.println("Age     : " +stud[loop].getAge());
            System.out.println("Gender  : " +stud[loop].getGender());
            
            if(stud[loop].getFlag()){
                System.out.printf("%s passed OOP subject, good job!!\n", stud[loop].getName());}
            else{
                System.out.printf("%s failed OOP subject, see u next sem!!\n", stud[loop].getName());}  
        }
        
        //Find Minimum and Maximum Age
        for(int loop=0;loop<stud.length;loop++){
            
            if(stud[loop].getAge()>maxAge){
                maxAge=stud[loop].getAge();
                max=loop;}
            
            if(stud[loop].getAge()<minAge){
                minAge=stud[loop].getAge();
                min=loop;}
        }
        
        //Display Minimum and Maximum Age
        System.out.println("\n« MINIMUM & MAXIMUM AGE VALUE »");
        System.out.printf("Youngest => %s\t(%d)", stud[min].getName(), minAge);
        System.out.printf("\nOldest   => %s\t(%d)", stud[max].getName(), maxAge);
         
        //Search and Display Object Information
        for(int loop=0;loop<stud.length;loop++){
            
            if(stud[loop].getName().equals(searchName)){
                profile=loop;}
        }
        
        if(stud[profile].getGender()=='M'){
            
            if(stud[profile].getFlag()){
                result="He PASSED OOP subject";}
            else{
                result="He FAILED OOP subject";}
        }
            
        else{
            
            if(stud[profile].getFlag()){
                result="She PASSED OOP subject";}
            else{
                result="She FAILED OOP subject";}
        }
        
        System.out.println("\n\n« SEARCHING »");
        
        System.out.printf("\n%s's Profile", stud[profile].getName());
        System.out.println("\n----------------------");
        System.out.println("Age     : " +stud[profile].getAge());
        System.out.println("Sex     : " +stud[profile].getGender());
        System.out.println("Result  : " +result);
        
        //Display Students in a Group: PASS with percentage
        System.out.println("\n|-----------------------|");
        System.out.println("|List of PASSED Students|");
        System.out.println("|-----------------------|");
        
        loopNo=1;
        
        for(int loop=0;loop<stud.length;loop++){
            
            if(stud[loop].getFlag()){
                System.out.printf("%d)%s, %d marks\n", loopNo++, stud[loop].getName(), stud[loop].getMark());}
        }
        
        percentPass=((loopNo-1)/(float)stud.length)*100;
        System.out.printf("\nTOTAL => %d/%d (%.2f%%)", loopNo-1, stud.length, percentPass);
        
        //Display Students in a Group: FAIL with percentage
        System.out.println("\n\n|-----------------------|");
        System.out.println("|List of FAILED Students|");
        System.out.println("|-----------------------|");
        
        loopNo=1;

        for(int loop=0;loop<stud.length;loop++){
            
            if(!stud[loop].getFlag()){
                System.out.printf("%d)%s,\t %d marks\n", loopNo++, stud[loop].getName(), stud[loop].getMark());}
        }
        
        percentFail=((loopNo-1)/(float)stud.length)*100;
        System.out.printf("\nTOTAL => %d/%d (%.2f%%)", loopNo-1, stud.length, percentFail);
                
        System.out.println("\n");
    } 
}

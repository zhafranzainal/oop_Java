package courseresult;

import java.util.Scanner;

public class CourseResult{

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
                
        System.out.print("Please enter the student name             : ");
        String name = input.nextLine();
        
        System.out.print("Please enter the student matric no        : ");
        String matricNo = input.nextLine();
        
        System.out.print("Please enter the student year of study    : ");
        int yearOfStudy = input.nextInt();
        
        System.out.print("Please enter the number of subjects taken : ");
        int subjectTotal = input.nextInt();
        input.nextLine();
        
        Student student = new Student(name, matricNo, yearOfStudy, subjectTotal);
        Subject subject[] = new Subject[subjectTotal];
        
        for(int loop=0;loop<subjectTotal;loop++){
            
            subject[loop] = new Subject();
            
            System.out.printf("\nPlease enter the subject %d name                   : ", loop+1);
            subject[loop].setSubjectName(input.nextLine());
            
            System.out.print("Please enter the credit hours for this subject    : ");
            subject[loop].setCreditHours(input.nextInt());
            input.nextLine();
            
            System.out.print("Please enter the subject grade                    : ");
            subject[loop].setSubjectGrade(input.nextLine());
            
        }
        
        System.out.printf("\nName: %s\t Matric No: %s\t Year: %d\t Subjects Taken: %d", name, matricNo, yearOfStudy, subjectTotal);
        System.out.println("\n\nSubject Name\t Credit Hours\t Subject Grade");
        
        for(int loop=0;loop<subjectTotal;loop++){
            subject[loop].displayInfo();}
        
        System.out.println("");
        
    }
}

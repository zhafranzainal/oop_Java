package bookapplication;

import java.util.Scanner;

public class BookApplication{

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        //Array
        Book arrayBook[] = new Book[3];
        
        for(int loop=0;loop<arrayBook.length;loop++){
            
            arrayBook[loop] = new Book(null, null, null);
            
            System.out.print("Enter book title  : ");
            arrayBook[loop].setTitle(input.nextLine());
            
            System.out.print("Enter author name : ");
            arrayBook[loop].setAuthor(input.nextLine());
            
            System.out.print("Enter call number : ");
            arrayBook[loop].setCallNumber(input.nextLine());
            
            System.out.println("");
        }
        
        for(int loop=0;loop<arrayBook.length;loop++){
            arrayBook[loop].printBookInfo(loop);}
            
    }
}

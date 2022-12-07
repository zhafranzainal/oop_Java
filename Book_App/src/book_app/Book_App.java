package book_app;

import java.util.Scanner;

public class Book_App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String authorName;

        // Array
        Book arrBook[] = new Book[5];
        arrBook[0] = new Book("Aariz Hassan", "Head First Java", 2011, new CallNumber("CT001"));
        arrBook[1] = new Book("Aqeel Hussain", "History of Silat", 2013, new CallNumber("SC003"));
        arrBook[2] = new Book("Fatimah", "My Mother's Garden", 2016, new CallNumber("KD004"));
        arrBook[3] = new Book("Liu Yifei", "The Midnight Library", 1998, new CallNumber("FB002"));
        arrBook[4] = new Book("Ravi Subramanian", "Computer Code with C#", 2022, new CallNumber("CT004"));

        System.out.println("<< List of Books >>\n");
        for (int loop = 0; loop < arrBook.length; loop++) {
            arrBook[loop].printBookDetails();
        }

        System.out.print("<< SEARCHING >>\n");

        // Prompt error for validation
        for (;;) {
            System.out.print("\nEnter author's full name: ");
            authorName = input.nextLine();

            if (authorName.equals("Aariz Hassan") || authorName.equals("Aqeel Hussain") || authorName.equals("Fatimah") || authorName.equals("Liu Yifei") || authorName.equals("Ravi Subramanian")) {
                break;
            }

            System.out.println("\nERROR! Please insert full name of the available authors only.");
        }

        for (int loop = 0; loop < arrBook.length; loop++) {
            if (authorName.equals(arrBook[loop].getAuthor())) {
                System.out.println("");
                arrBook[loop].printBookDetails();
            }
        }

    }

}

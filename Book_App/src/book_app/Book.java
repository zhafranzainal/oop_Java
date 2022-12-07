package book_app;

public class Book {

    private String author;
    protected String title;
    protected int yearPublished;
    protected CallNumber callnum;

    public Book(String author, String title, int yearPublished, CallNumber callnum) {
        this.author = author;
        this.title = title;
        this.yearPublished = yearPublished;
        this.callnum = callnum;
    }

    public void printBookDetails() {

        String genre;
        String location;

        genre = switch (callnum.getCallNum().substring(0, 2)) {
            case "CT" -> "Information Technology";
            case "EE" -> "Engineering";
            case "SC" -> "Arts & Social Sciences";
            case "FB" -> "Novel & Fiction";
            case "KD" -> "Kids & Comic";
            default -> "Unknown";
        };

        location = switch (callnum.getCallNum().substring(2, 5)) {
            case "001" -> "Level One";
            case "002" -> "Level Two";
            case "003" -> "Level Three";
            case "004" -> "Level Four";
            case "005" -> "Level Five";
            default -> "Level Not Available";
        };

        System.out.printf("Author      >> %s", getAuthor());
        System.out.printf("\nTitle       >> %s", title);
        System.out.printf("\nYear        >> %d", yearPublished);
        System.out.printf("\nGenre       >> %s", genre);
        System.out.printf("\nLocation    >> %s\n\n", location);
        
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

}

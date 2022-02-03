package bookapplication;

public class Book{
    
    private String title, author, callNumber;
    
    public Book(String title, String author, String callNumber){
        this.title=title;
        this.author=author;
        this.callNumber=callNumber;}

    public String getTitle(){
        return title;}
    
    public String getAuthor(){
        return author;}
    
    public String getCallNumber(){
        return callNumber;}

    public void setTitle(String title){
        this.title = title;}

    public void setAuthor(String author){
        this.author = author;}

    public void setCallNumber(String callNumber){
        this.callNumber = callNumber;}
    
    public void printBookInfo(int loop){
        
        System.out.printf("<< Book %d Information >>", loop+1);
        System.out.println("\nAuthor Name : " +getAuthor());
        System.out.println("Book Title  : " +getTitle());
        System.out.println("Call Number : " +getCallNumber());
        
        System.out.println("");
        
    }
}

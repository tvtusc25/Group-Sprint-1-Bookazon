public class Book extends Media{

    private boolean isPaperback;  // true if the book is paperback, false if it is hardcover d

    public Book(String title, String author, int yearPublished, double price, boolean isPaperback) {
        
        super(title, author, yearPublished, price);
        this.isPaperback = isPaperback;
    }

  
    public boolean isPaperback() {
        return isPaperback;
    }

    public void setPaperback(boolean isPaperback) {
        this.isPaperback = isPaperback;
    }





   
    
}
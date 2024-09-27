
public abstract class Media{

    protected String title;
    protected String author; 
    protected int yearPublished;
    protected double price;


    public Media(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public boolean equals(Media item) {
        return this.title.equals(item.getTitle());
    }
    
    public boolean isItemNameValid() {
        return title != null && !title.isEmpty();
    }

    public String getAuthor() {
        return this.author;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setPrice(double price){
        this.price = price; 
    }

    public void setAuthor(String creator) {
        this.author = creator;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    public boolean isPriceValid() {
        return price > 0;
    } 

    public boolean isAuthorValid() {
        return author != null && !author.isEmpty();
    }

    public boolean isYearPublishedValid() {
        return yearPublished > 0;
    }

    public void printDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Price: $" + price);
    }


}


/**
 * Write a description of class Book here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Book extends Media {
    private static int numBooks = 0;
    
    public Book()
    {
        super("A Book", 0, 0.0, false);
        numBooks++;
    }
    
    public Book(String title) {
        super(title, 0, 0.0, false);
        numBooks++;
    }
    
    public Book(String title, boolean favorite) {
        super(title, 0, 0.0, favorite);
        numBooks++;
    }
    
    public Book(String title, int rating) {
        super(title, rating, 0.0, false);
        numBooks++;
    }
    
    public Book(String title, int rating, boolean favorite) {
        super(title, rating, 0.0, favorite);
        numBooks++;
    }
    
    public Book(String title, double price) {
        super(title, 0, price, false);
        numBooks++;
    }
    
    public Book(String title, double price, boolean favorite) {
        super(title, 0, price, favorite);
        numBooks++;
    }
    
    public Book(String title, int rating, double price) {
        super(title, rating, price, false);
        numBooks++;
    }
    
    public Book(int rating) {
        super("A Book", rating, 0.0, false);
        numBooks++;
    }
    
    public Book(int rating, boolean favorite) {
        super("A Book", rating, 0.0, favorite);
        numBooks++;
    }
    
    public Book(int rating, double price) {
        super("A Book", rating, price, false);
        numBooks++;
    }
    
    public Book(int rating, double price, boolean favorite) {
        super("A Book", rating, price, favorite);
        numBooks++;
    }
    
    public static int getNumBooks() {
        return numBooks;
    }
}

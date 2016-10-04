/**
 * Write a description of class Movie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Movie extends Media {
    private static int numMovies = 0;
    private static int duration = 0;
    
    public Movie() {
        super("A Movie", 0, 0.0, false);
        numMovies++;
    }
    
    public Movie(String title) {
        super(title, 0, 0.0, false);
        numMovies++;
    }
    
    public Movie(String title, boolean favorite) {
        super(title, 0, 0.0, favorite);
        numMovies++;
    }
    
    public Movie(String title, int rating) {
        super(title, rating, 0.0, false);
        numMovies++;
    }
    
    public Movie(String title, int rating, boolean favorite) {
        super(title, rating, 0.0, favorite);
        numMovies++;
    }
    
    public Movie(String title, double price) {
        super(title, 0, price, false);
        numMovies++;
    }
    
    public Movie(String title, double price, boolean favorite) {
        super(title, 0, price, favorite);
        numMovies++;
    }
    
    public Movie(String title, int rating, double price) {
        super(title, rating, price, false);
        numMovies++;
    }
    
    public Movie(int rating) {
        super("A Movie", rating, 0.0, false);
        numMovies++;
    }
    
    public Movie(int rating, boolean favorite) {
        super("A Movie", rating, 0.0, favorite);
        numMovies++;
    }
    
    public Movie(int rating, double price) {
        super("A Movie", rating, price, false);
        numMovies++;
    }
    
    public Movie(int rating, double price, boolean favorite) {
        super("A Movie", rating, price, favorite);
        numMovies++;
    }
    
    public static void addDuration(int d) {
        duration += d;
    }
    
    public static int getDuration() {
        return duration;
    }
    
    public static void printDuration() {
        int h = getDuration() / 60;
        int m = getDuration() % 60;
        System.out.printf("Total duration: %d hours and %d minutes.%n", h, m);
    }
    
    public static int getNumMovies() {
        return numMovies;
    }
}

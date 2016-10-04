/**
 * Write a description of class Song here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Song extends Media {
    private static int numSongs = 0;
    
    public Song()
    {
        super("A Song", 0, 0.0, false);
        numSongs++;
    }
    
    public Song(String title) {
        super(title, 0, 0.0, false);
        numSongs++;
    }
    
    public Song(String title, boolean favorite) {
        super(title, 0, 0.0, favorite);
        numSongs++;
    }
    
    public Song(String title, int rating) {
        super(title, rating, 0.0, false);
        numSongs++;
    }
    
    public Song(String title, int rating, boolean favorite) {
        super(title, rating, 0.0, favorite);
        numSongs++;
    }
    
    public Song(String title, double price) {
        super(title, 0, price, false);
        numSongs++;
    }
    
    public Song(String title, double price, boolean favorite) {
        super(title, 0, price, favorite);
        numSongs++;
    }
    
    public Song(String title, int rating, double price) {
        super(title, rating, price, false);
        numSongs++;
    }
    
    public Song(int rating) {
        super("A Song", rating, 0.0, false);
        numSongs++;
    }
    
    public Song(int rating, boolean favorite) {
        super("A Song", rating, 0.0, favorite);
        numSongs++;
    }
    
    public Song(int rating, double price) {
        super("A Song", rating, price, false);
        numSongs++;
    }
    
    public Song(int rating, double price, boolean favorite) {
        super("A Song", rating, price, favorite);
        numSongs++;
    }
    
    public static int getNumSongs() {
        return numSongs;
    }
}

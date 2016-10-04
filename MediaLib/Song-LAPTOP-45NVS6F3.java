
/**
 * Write a description of class Song here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Song
{
    // instance variables - replace the example below with your own
    private int rating;
    private String title;

    /**
     * Constructor for objects of class Song
     */
    public Song()
    {
        // initialise instance variables
        rating = 0;
        title = "";
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String newTitle){
        title = newTitle;
    }
    
    public int getRating() {
        return rating;
    }
    
    public void setRating(int newRating){
        if (rating <= 0 || rating >= 10) return;
        rating = newRating;
    }
}

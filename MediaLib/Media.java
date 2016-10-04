import java.lang.IllegalArgumentException;

public class Media {
    private static double totalCost = 0.;
    private static int numMedia = 0;
    private static int totalRatings = 0;
    
    private int rating;
    private String title;
    private double price;
    private boolean favorite;

    /**
     * Constructor for objects of class Media
     */    
    public Media (String title, int rating, double price, boolean favorite) {
        this.title = title;
        this.price = price;
        this.favorite = favorite;
        setRating(rating); // call the method for the value sanity check
        numMedia++;
        totalCost += price;
        totalRatings += rating;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String newTitle) {
        title = newTitle;
    }
    
    public int getRating() {
        return rating;
    }
    
    public void setRating(int newRating) {
        if (newRating < 0 || newRating > 10)
            throw new IllegalArgumentException("Rating must be between 0 and 10");
        else {
            totalRatings += newRating - rating;
            rating = newRating;
        }
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double newPrice) {
        totalCost += newPrice - price;
        price = newPrice;
    }
    
    public boolean isFavorite() {
        return favorite;
    }
    
    public void addToFavorites() {
        favorite = true;
    }
    
    public void toggleFavorite() {
        favorite = !favorite;
    }
    
    public static int getNumMedia() {
        return numMedia;
    }
    
    public static double getTotalCost() {
        return totalCost;
    }
    
    public static double getTotalRatings() {
        return totalRatings;
    }
}
import java.util.ArrayList;

/**
 * Write a description of class MediaLib here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MediaLib
{
    public static void main(String[] args) {
        System.out.println("Welcome to your Media Library");
        
        ArrayList<Media> library = new ArrayList<>();
        
        Media song1 = new Song();
        song1.setTitle("The Most Popular Song");
        song1.setRating(10);
        song1.setPrice(5.00);
        song1.toggleFavorite();
        library.add(song1);
        
        Media book1 = new Book();
        book1.setTitle("The Most Popular Book");
        book1.setRating(10);
        library.add(book1);
        
        Media movie1 = new Movie();
        movie1.setTitle("The Most Popular Movie");
        movie1.setRating(10);
        library.add(movie1);
        
        library.add(new Song("A Bad Song", 0));
        library.add(new Song("A Generic Song"));
        library.add(new Song());
        library.add(new Song("A Good Song", 10, true));
        library.add(new Song("A soundtrack"));
        library.add(new Song("A Song about repeating a day of the week.", 2, 0.99));
        library.add(new Song("That song you play when you're out of ideas", 0.0));
        
        System.out.println("Library length: " + library.size());
        System.out.printf("Average Cost: $%.2f%n", (Media.getTotalCost() / Media.getNumMedia()));
        System.out.printf("Average Rating: %.1f%n", (Media.getTotalRatings() / Media.getNumMedia()));
        
        for (Media m : library) {
            System.out.println("------------------------------");
            System.out.println(m);
            System.out.println(m.getTitle());
            System.out.println(m.getRating());
            System.out.println(m.getPrice());
            System.out.println(m.isFavorite());
        }
        
        Movie.addDuration(100);
        Movie.addDuration(90);
        Movie.addDuration(25);
        Movie.addDuration(30);
        Movie.addDuration(400);
        Movie.printDuration();
    }
}


/**
 * SciFiName gathers input from a user to generate a custom name that
 * sounds like it could be used in a science fiction book or movie.
 * 
 * @author ckinnard
 * @version 3/4/16
 */

public class SciFiName   
{
    /**
     * All input that you privide should be at least three letters long
     * or the program may crash (but feel free to test this!)
     * 
     * For best results, user lowercase letters and do not use spaces in your input
     */
    public static void main(String[] args)
    {
        System.out.println("If you provide me some information I will provide a Science Fiction name for you.");
        System.out.println("Please have all responses  be at least three characters long.");
        System.out.println("For best results, user lowercase letters with no spaces.\n");
        //                                       ^ "user"? Don't you mean "use"?

        // notice this methd (print) does not print a newline
        //                ^ Notice how "method" is spelled incorrectly.
        System.out.print("Enter your first name in lowercase: ");
        String firstName = UserInput.getString();
        checkLower(firstName);

        System.out.print("Enter your last name in lowercase: ");
        String lastName = UserInput.getString();
        checkLower(lastName);

        System.out.print("Enter the city where you or one of your parents were born in lowercase: ");
        String city = UserInput.getString();
        checkLower(city);

        System.out.print("Enter the name of your grammar school in lowercase: ");
        //                                       ^ grammar school?
        String school = UserInput.getString();
        checkLower(school);

        System.out.print("Enter the first name of a sibling or other relative in lowercase: ");
        String relativeName1 = UserInput.getString();
        checkLower(relativeName1);

        System.out.print("Enter the first name of a second sibling or relative in lowercase: ");
        String relativeName2 = UserInput.getString();
        checkLower(relativeName2);

        // generate a sciFi name
        String sciFiFirstName = (firstName.substring(0, 3) + lastName.substring(0, 2))
                .toLowerCase();
        sciFiFirstName = Character.toUpperCase(sciFiFirstName.charAt(0))
                + sciFiFirstName.substring(1);
        System.out.println("Your sci-fi first name: " + sciFiFirstName);

        String sciFiLastName = (city.substring(0, 2) + school.substring(0, 3))
                .toLowerCase();
        sciFiLastName = Character.toUpperCase(sciFiLastName.charAt(0))
                + sciFiLastName.substring(1);
        System.out.println("Your sci-fi last name: " + sciFiLastName);

        int randomCharOfRelative1Name = (int) (Math.random() * relativeName1.length());
        int randomCharofRelative2Name = (int) (Math.random() * relativeName2.length());
        String placeOfOrigin = (relativeName1.substring(randomCharOfRelative1Name)
                + relativeName2.substring(randomCharofRelative2Name))
                .toLowerCase();
        placeOfOrigin = Character.toUpperCase(placeOfOrigin.charAt(0))
                + placeOfOrigin.substring(1);
        System.out.println("Your sci-fi place of origin: " + placeOfOrigin);

        System.out.printf("Hello %s %s of %s. Welcome!",
                sciFiFirstName, sciFiLastName, placeOfOrigin);
    }

    private static void checkLower(String s) {
        if (s.toLowerCase().equals(s)) return;
        System.err.println("That was not lowercase!");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ignored) {}
    }
}

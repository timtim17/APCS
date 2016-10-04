public class WeatherConditionals {
    public static String getWeatherAdvice(int temperature, String description) {
        boolean windy = description.indexOf("windy") != -1;
        if ((temperature >= 34 &&  description.equals("sunny")) || (temperature >= 33 && temperature <= 100 && description.equals("snow")))
            return String.format("It's safe to go outside, %d degrees and %s.", temperature, description);
        else if (description.indexOf("snow") != -1 && temperature > 100)
            throw new IllegalArgumentException(String.format("Snow in %d degree weather?", temperature));
        else return "Too windy or cold! Enjoy watching the weather through the window.";
        //  return String.format("%d degrees and %s.", temperature, description);
    }
}

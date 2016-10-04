
/**
 * Write a description of class StringTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringTester
{
    public static void main(String[] args) {
        String[] weatherDescr = "tornado,tropical storm,hurricane,severe thunderstorms,thunderstorms,mixed rain and snow,mixed rain and sleet,mixed snow and sleet,freezing drizzle,drizzle,freezing rain,showers,showers,snow flurries,light snow showers,blowing snow,snow,hail,sleet,dust,foggy,haze,smoky,blustery,windy,cold,cloudy,mostly cloudy (night),mostly cloudy (day),partly cloudy (night),partly cloudy (day),clear (night),sunny,fair (night),fair (day),mixed rain and hail,hot,isolated thunderstorms,scattered thunderstorms,scattered thunderstorms,scattered showers,heavy snow,scattered snow showers,heavy snow,partly cloudy,thundershowers,snow showers,isolated thundershowers,not available".split(",");;
        
        String weatherCondition = weatherDescr[0];
        System.out.println(weatherCondition);
        
        System.out.println("===============================\nStart With 5 Letter Word\n===============================");
        int[] startsWith5LetterWord = {5, 6, 7, 14, 18, 22, 24, 31, 32, 35, 41, 43};
        for (int i : startsWith5LetterWord)
            System.out.println(weatherDescr[i].substring(0, 5));
        
        // print first word of all
        System.out.println("===============================\nAll First Words\n===============================");
        for (String desc : weatherDescr) {
            int indexOfSpace = desc.indexOf(' ');
            if (indexOfSpace == -1)
                System.out.println(desc);
            else
                System.out.println(desc.substring(0, indexOfSpace));
        }
        
        System.out.println(WeatherConditionals.getWeatherAdvice(32, weatherDescr[41]));
        
        System.out.println(WeatherConditionals.getWeatherAdvice(34, "sunny"));
        System.out.println(WeatherConditionals.getWeatherAdvice(32, "windy"));
        System.out.println(WeatherConditionals.getWeatherAdvice(33, "snow"));
        System.out.println(WeatherConditionals.getWeatherAdvice(30, "snow"));
        System.out.println(WeatherConditionals.getWeatherAdvice(30, "windy"));
        
        try {WeatherConditionals.getWeatherAdvice(101, "snow");}
        catch (IllegalArgumentException e) {e.printStackTrace();}
    }
}

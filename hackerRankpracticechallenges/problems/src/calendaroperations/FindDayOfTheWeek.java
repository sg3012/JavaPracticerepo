package hackerRankpracticechallenges.problems.src.calendaroperations;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

// The Calendar class is an abstract class that provides
// methods for converting between a specific instant in time and a set
// of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on,
// and for manipulating the calendar fields, such as getting the date
// of the next week.

// You are given a date. You just need to write the method,getDay() , which
// returns the day on that date. To simplify your task, we have
// provided a portion of the code in the editor.

// Example :
// month = 8
// day = 14
// year = 2017
// The method should return MONDAY as the day on that date.

// Function Description
// Complete the findDay function in the editor below.

// findDay has the following parameters:
// int: month
// int: day
// int: year

// Returns
// string: the day of the week in capital letters

// Input Format
// A single line of input containing the space separated month,
// day and year, respectively, in    format.

// Constraints
// 2000 <year < 3000

// Sample Input
// 08 05 2015

// Sample Output
// WEDNESDAY

// Explanation

// The day on August 5th 2015 was WEDNESDAY.

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    // public static String findDay(int month, int day, int year) {
    // }
}


public class FindDayOfTheWeek {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new
        // BufferedReader(new InputStreamReader(System.in));

        // BufferedWriter bufferedWriter = new
        // BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        // String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        // int month = Integer.parseInt(firstMultipleInput[0]);

        // int day = Integer.parseInt(firstMultipleInput[1]);

        // int year = Integer.parseInt(firstMultipleInput[2]);

        // String res = Result.findDay(month, day, year);

        // bufferedWriter.write(res);
        // bufferedWriter.newLine();

        // bufferedReader.close();
        // bufferedWriter.close();
        // Calendar calendar = Calendar.getInstance();
        // System.out.println(calendar);
        // System.out.println(calendar.getCalendarType());

        // String[] tz = TimeZone.getAvailableIDs();

        // System.out.println("Available TimeZones: ");
        // for(int i=0; i<tz.length;i++){
        //     System.out.println(tz[i]);
        // }

    //    TimeZone timeZone = TimeZone.getTimeZone("Asia/Calcutta");
    //    String timeZoneId = timeZone.getID();
    //    System.out.println("timeZone: "+timeZone);
    //    System.out.println("timeZoneID: "+timeZoneId);

    // System.out.println(Calendar.ALL_STYLES);

        Locale locale = new Locale("en", "UK");
        // Locale locale = Locale.getDefault();
        System.out.println("Locale: "+ locale);
    //    Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT-10:30"));

       Calendar calendar = Calendar.getInstance(locale);
       calendar.set(2015, 7, 5);
    //    System.out.println(calendar);
    //    System.out.println(calendar.getCalendarType());
    //    Locale locale = new Locale("en", "US");
    //    System.out.println("Locale: "+ locale);
    // System.out.println(Calendar.SUNDAY);

    Date date = calendar.getTime();
    System.out.println("DATE: "+date);
    System.out.println("Calendar year: "+calendar.get(Calendar.YEAR));
    System.out.println("Calendar month: "+ calendar.get(Calendar.MONTH));
    System.out.println("Calendar day of month: "+calendar.get(Calendar.DAY_OF_MONTH));
    System.out.println("Calendar day of week: "+Calendar.DAY_OF_WEEK);
    // System.out.println("Calendar day of the week in month: "+calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

    // calendar.clear();
    // System.out.println("Day of week: "+calendar.get(1));
    String day = calendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG_FORMAT, locale);
    System.out.println(day);
    //    Map<String, Integer> calMap = calendar.getDisplayNames(Calendar.SUNDAY, Calendar.SHORT, locale);
    //    NavigableMap<String, Integer> Nav_Map = new TreeMap<String, Integer>(calMap);
    //    System.out.println(Nav_Map);

    //    int firstDay = calendar.getFirstDayOfWeek();
    //    System.out.println("FirstDay: "+firstDay);
    //    System.out.println("Day of month: "+ Calendar.DAY_OF_MONTH);
    //    calendar.clear();


       // String[] s = Locale.getISOCountries();
        // Locale[] lo= Locale.getAvailableLocales();
        // // System.out.println("Available countries: ");
        // System.out.println("Available locales: ");
        // for(int i=0; i<lo.length;i++){
        //     String convert = lo[i].toString();
        //     if()
        //     System.out.print(lo[i]+" ");
        //     System.out.println(lo[i] instanceof Locale);
        // }

    }
}

package Ch_09;

// Created By: Reda Elsayed
/*(Use the GregorianCalendar class) Java API has the GregorianCalendar
class in the java.util package, which you can use to obtain the year, month, and
day of a date. The no-arg constructor constructs an instance for the current date,
and the methods get(GregorianCalendar.YEAR), get(GregorianCalendar.MONTH), and get(GregorianCalendar.DAY_OF_MONTH) return the year,
month, and day. Write a program to perform two tasks:
1. Display the current year, month, and day.
2. The GregorianCalendar class has the setTimeInMillis(long), which
can be used to set a specified elapsed time since January 1, 1970. Set the value
to 1234567898765L and display the year, month, and day*/

import java.util.GregorianCalendar;
public class problem05 {
    public static void main(String[] args) {
        // Task 1: Display the current year, month, and day
        GregorianCalendar currentDate = new GregorianCalendar();
        int currentYear = currentDate.get(GregorianCalendar.YEAR);
        int currentMonth = currentDate.get(GregorianCalendar.MONTH) + 1; // Adding 1 because months are zero-based
        int currentDay = currentDate.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("Current Date:");
        System.out.println("Year: " + currentYear);
        System.out.println("Month: " + currentMonth);
        System.out.println("Day: " + currentDay);

        // Task 2: Set the value to 1234567898765L and display the year, month, and day
        long elapsedMillis = 1234567898765L;
        GregorianCalendar customDate = new GregorianCalendar();
        customDate.setTimeInMillis(elapsedMillis);

        int customYear = customDate.get(GregorianCalendar.YEAR);
        int customMonth = customDate.get(GregorianCalendar.MONTH) + 1; // Adding 1 because months are zero-based
        int customDay = customDate.get(GregorianCalendar.DAY_OF_MONTH);

        System.out.println("\nCustom Date (1234567898765L milliseconds since January 1, 1970):");
        System.out.println("Year: " + customYear);
        System.out.println("Month: " + customMonth);
        System.out.println("Day: " + customDay);
    }
}

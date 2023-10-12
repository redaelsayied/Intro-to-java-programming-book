package Ch_02;

// Created By: Reda Elsayed
import java.util.Scanner;

/**
 **2.8 (Current time) Listing 2.7, ShowCurrentTime.java, gives a program that displays
 * the current time in GMT. Revise the program so it prompts the user to enter the
 * time zone offset to GMT and displays the time in the specified time zone. Here is
 * a sample run:
 * Enter the time zone offset to GMT: -5
 * The current time is 4:50:34
 */
public class Problem02_08 {
    public static void main(String[] arsg) {
        Scanner input=new Scanner(System.in);
        long totalMilliSecond=System.currentTimeMillis();
        long totalSecond=totalMilliSecond/1000;
        long currentSecond=totalSecond%60;
        long totalMinutes=totalSecond/60;
        long currentMinutes=totalMinutes%60;
        long totalHours=totalMinutes/60;
        long currentHours=totalHours%24;

        System.out.print("Enter the time zone offset to GMT: ");
        int timeZoneOffset=input.nextInt();
        currentHours+=timeZoneOffset;

        System.out.println("The current time is "+currentHours+":"+currentMinutes+":"+currentSecond);
    }

}

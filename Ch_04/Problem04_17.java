package Ch_04;

// Created By: Reda Elsayed

import java.util.Scanner;

/*(Days of a month) Write a program that prompts the user to enter the year and the
first three letters of a month name (with the first letter in uppercase) and displays
the number of days in the month. If the input for month is incorrect, display a
message as presented in the following sample runs:
Enter a year: 2001
Enter a month: Jan
Jan 2001 has 31 days*/

public class Problem04_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the year from the user
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Get the month from the user
        System.out.print("Enter a month: ");
        String month = input.next();

        // Validate the month input and calculate the number of days
        int daysInMonth;
        switch (month) {
            case "Jan":
            case "Mar":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec":
                daysInMonth = 31;
                break;
            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov":
                daysInMonth = 30;
                break;
            case "Feb":
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    daysInMonth = 29;
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                System.out.println("Invalid month input. Please enter the first three letters of a valid month name (e.g., Jan, Feb, Mar, etc.).");
                input.close();
                return;
        }

        // Display the result
        System.out.println(month + " " + year + " has " + daysInMonth + " days");
        input.close();
    }
}

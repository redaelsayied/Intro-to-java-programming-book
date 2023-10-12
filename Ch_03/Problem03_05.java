package Ch_03;

// Created By: Reda Elsayed
import java.util.Scanner;

/**
 * *3.5 (Find future dates) Write a program that prompts the user to enter an integer for
 * today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also
 * prompt the user to enter the number of days after today for a future day and display the future day of the week. Here is a sample run:
 * Enter today’s day: 1
 * Enter the number of days elapsed since today: 3
 * Today is Monday and the future day is Thursday
 * Enter today’s day: 0
 * Enter the number of days elapsed since today: 31
 * Today is Sunday and the future day is Wednesday
 */
public class Problem03_05 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String []days={"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
        System.out.print("Enter today’s day: ");
        int today=input.nextInt();
        System.out.print("Enter the number of days elapsed since today:");
        int numberOfDays=input.nextInt();

        int nextDay=(numberOfDays+today)%7;
        System.out.println("Today is "+days[today]+" and the future day is "+days[nextDay]);


    }
}

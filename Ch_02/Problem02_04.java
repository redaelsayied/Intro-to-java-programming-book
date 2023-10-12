package Ch_02;

// Created By: Reda Elsayed
import java.util.Scanner;

/**2.4
 * (Convert pounds into kilograms) Write a program that converts pounds into kilograms. The program prompts the user to enter a number in pounds, converts it
 * to kilograms, and displays the result. One pound is 0.454 kilogram. Here is a
 * sample run:
 * Enter a number in pounds: 55.5
 * 55.5 pounds is 25.197 kilograms
 */
public class Problem02_04 {

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        double pounds,kilograms;
        final double POUNDS_TO_KILOGRAMS_RATIO=.454;

        System.out.println("Enter a number in pounds: ");
        pounds=input.nextDouble();
        kilograms=pounds*POUNDS_TO_KILOGRAMS_RATIO;

        System.out.println(pounds + " pounds is equal to " + kilograms + " kilograms");
    }
}

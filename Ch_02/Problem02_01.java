package Ch_02;

// Created By: Reda Elsayed
import java.util.Scanner;

/** 2.1
 * (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a
 * double value from the console, then converts it to Fahrenheit, and displays the
 * result. The formula for the conversion is as follows:
 * fahrenheit = (9 / 5) * celsius + 32
 * Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
 * Here is a sample run:
 * Enter a degree in Celsius: 43.5
 * 43.5 Celsius is 110.3 Fahrenheit
 */

public class Problem02_01 {
	public static void main(String[]args) {
		double celsius,fahrenheit;
		
		System.out.println("Enter a degree in Celsius:");
		Scanner input = new Scanner(System.in);
		celsius = input.nextDouble();

		fahrenheit = 9.0/5 * celsius + 32;
		System.out.println(celsius+" Celsius is "+fahrenheit);

	}
}

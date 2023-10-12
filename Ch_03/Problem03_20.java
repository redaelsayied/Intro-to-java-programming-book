package Ch_03;


// Created By: Reda Elsayed
import java.util.*;

/**
 * *(Science: wind-chill temperature) Programming Exercise 2.17 gives a formula to
 * compute the wind-chill temperature. The formula is valid for temperatures in the
 * range between -58°F and 41°F and wind speed greater than or equal to 2. Write
 * a program that prompts the user to enter a temperature and a wind speed. The
 * program displays the wind-chill temperature if the input is valid; otherwise,
 * it displays a message indicating whether the temperature and/or wind speed is invalid
 */
public class Problem03_20 extends Problem03_21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temp = input.nextDouble();

        System.out.println("Enter the wind speed (>=2) in miles per hour: ");
        int windSpeed = input.nextInt();

        if (temp >= -58 && temp <= 41 && windSpeed >= 2) {

            double vToPow16 = Math.pow(windSpeed, 0.16);

            double twc = 35.74 + 0.6215 * temp - 35.75 * vToPow16 + 0.4275 * temp * vToPow16;
            System.out.println("The wind chill index is " + twc);
        } else {
            System.out.println("Please check to make sure you are entering valid input.");
        }
        input.close();
    }
}
package Ch_02;

// Created By: Reda Elsayed
import java.util.Scanner;

/**2.3
 * (Convert feet into meters) Write a program that reads a number in feet, converts it
 * to meters, and displays the result. One foot is 0.305 meter. Here is a sample run:
 * Enter a value for feet: 16.5
 * 16.5 feet is 5.0325 meters
 */
public class Problem02_03 {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        double numberOfFeet,numberOfMeters;
        final double FEET_TO_METERS_RATIO=.305;

        System.out.println("Enter a value for feet:");
        numberOfFeet=input.nextDouble();
        numberOfMeters=numberOfFeet*FEET_TO_METERS_RATIO;

        System.out.println(numberOfFeet+" feet is: "+numberOfMeters+" meters");

    }
}

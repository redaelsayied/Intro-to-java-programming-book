package Ch_02;

// Created By: Reda Elsayed
import java.util.Scanner;

/**
 * 2.14 (Health application: computing BMI) Body Mass Index (BMI) is a measure of
 * health on weight. It can be calculated by taking your weight in kilograms and dividing, by the square of your height in meters. Write a program that prompts the user to
 * enter a weight in pounds and height in inches and displays the BMI. Note one pound
 * is 0.45359237 kilograms and one inch is 0.0254 meters. Here is a sample run:
 * VideoNote
 * Enter weight in pounds: 95.5
 * Enter height in inches: 50
 * BMI is 26.8573
 */
public class Problem02_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final double POUND_TO_KILOGRAM_RATIO=0.45359237;
        final double INCH_TO_METER_RATIO=0.0254;

        System.out.print("Enter weight in pounds:");
        double wieghtInPounds=input.nextDouble();

        System.out.print("Enter height in inches:");
        double heightInInches=input.nextDouble();

        double weightInKilogram=wieghtInPounds*POUND_TO_KILOGRAM_RATIO;
        double heightInMeter=heightInInches*INCH_TO_METER_RATIO;

        double bmi=weightInKilogram/Math.pow(heightInMeter,2);
        System.out.println("BMI is "+bmi);

    }
}

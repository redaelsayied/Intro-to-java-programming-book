package Ch_02;

// Created By: Reda Elsayed


import java.util.Scanner;

/**
 * 2.9 (Physics: acceleration) Average acceleration is defined as the change of velocity
 * divided by the time taken to make the change, as given by the following formula:
 * a = v1 - v0
 * t
 * Write a program that prompts the user to enter the starting velocity v0 in meters/
 * second, the ending velocity v1 in meters/second, and the time span t in seconds,
 * then displays the average acceleration. Here is a sample run:
 * Enter v0, v1, and t: 5.5 50.9 4.5
 * The average acceleration is 10.0889
 */
public class Problem02_09 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double startingVelocity;
        double endingVelocity;
        double time;
        double averageAcceleration;

        System.out.print("Enter v0, v1, and t:");
        startingVelocity=input.nextDouble();
        endingVelocity=input.nextDouble();
        time=input.nextDouble();

        averageAcceleration=(endingVelocity-startingVelocity)/time;

        System.out.println("The average acceleration is "+averageAcceleration);





    }
}

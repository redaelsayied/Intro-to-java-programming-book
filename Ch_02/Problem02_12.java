package Ch_02;


// Created By: Reda Elsayed

import java.util.Scanner;

/**
 * 2.12 (Physics: finding runway length) Given an airplane’s acceleration a and take-off
 * speed v, you can compute the minimum runway length needed for an airplane to
 * take off using the following formula:
 * length = v2
 * 2a
 * Write a program that prompts the user to enter v in meters/second (m/s) and
 * the acceleration a in meters/second squared (m/s
 * 2
 * ), then, displays the minimum
 * runway length.
 * Enter speed and acceleration: 60 3.5
 * The minimum runway length for this airplane is 514.286
 */
public class Problem02_12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double velocity,acceleration;
        System.out.print("Enter speed and acceleration: ");
        velocity=input.nextDouble();
        acceleration=input.nextDouble();

        double lengt=Math.pow(velocity,2)/(2*acceleration);
        System.out.println("The minimum runway length for this airplane is "+lengt);
    }
}

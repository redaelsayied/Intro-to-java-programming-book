package Ch_02;

// Created By: Reda Elsayed
import java.util.Scanner;

/** 2.2
 * (Compute the volume of a cylinder) Write a program that reads in the radius
 * and length of a cylinder and computes the area and volume using the following
 * formulas:
 * area = radius * radius * π
 * volume = area * length
 * Here is a sample run:
 * Enter the radius and length of a cylinder: 5.5 12
 * The area is 95.0331
 * The volume is 1140.4
 */
public class Problem02_02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double radius,length,area,volume;

        System.out.println("Enter the radius and length of a cylinder:");
        radius=input.nextDouble();
        length=input.nextDouble();

        area=radius*radius*Math.PI;
        volume=area*length;

        System.out.println("the area is :"+area);
        System.out.println("the volume is : "+volume);
    }
}

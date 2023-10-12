package Ch_02;

// Created By: Reda Elsayed
import java.util.Scanner;

/**
 * 2.15 (Geometry: distance of two points) Write a program that prompts the user to
 * enter two points (x1, y1) and (x2, y2) and displays their distance. The formula for computing the distance is 2(x2 - x1)
 * 2 + (y2 - y1)
 * 2
 * . Note you can use
 * Math.pow(a, 0.5) to compute 2a. Here is a sample run:
 * Enter x1 and y1: 1.5 -3.4
 * Enter x2 and y2: 4 5
 * The distance between the two points is 8.764131445842194
 */
public class Problem02_15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x1,y1,x2,y2;
        System.out.print("Enter x1 and y1: ");
        x1=input.nextDouble();
        y1=input.nextDouble();
        System.out.print("Enter x2 and y2: ");
        x2=input.nextDouble();
        y2=input.nextDouble();

        double distance=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        System.out.println("The distance between the two points is "+distance);



    }

}

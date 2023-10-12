package Ch_04;


// Created By: Reda Elsayed
import java.util.Scanner;

/**
 * 4.1 (Geometry: area of a pentagon) Write a program that prompts
 * the user to enter the length from the center of a pentagon
 * to a vertex and computes the area of the pentagon, as shown in the
 * following figure.
 */
public class Problem04_01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the length from the center to a vertex: ");
        double r=input.nextDouble();

        double side= getSide(r);

        double area=getArea(side);
        System.out.printf("The area of the pentagon is %.2f",area);

    }
    public static double getSide(double r){
        return 2*r*Math.sin(Math.PI/5);
    }
    public static double getArea(double s){
        return 5*Math.pow(s,2)/(4*Math.tan(Math.PI/5));
    }
}

package Ch_03;


// Created By: Reda Elsayed
import java.util.Scanner;

/**
 * (Compute the perimeter of a triangle) Write a program that reads three edges for
 * a triangle and computes the perimeter if the input is valid. Otherwise, display
 * that the input is invalid. The input is valid if the sum of every pair of two edges is
 * greater than the remaining edge.
 */
public class Problem03_19 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter three edges");
        double e1=input.nextDouble();
        double e2=input.nextDouble();
        double e3=input.nextDouble();

        if((e1+e2)>e3&&(e1+e3)>e2&&(e2+e3)>e1){
            System.out.println("the perimeter is : "+(e1+e2+e3));
        }else
            System.out.println("NOT Valid Triangle!");
    }
}

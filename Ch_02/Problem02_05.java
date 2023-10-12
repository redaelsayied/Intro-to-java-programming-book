package Ch_02;

// Created By: Reda Elsayed
import java.util.Scanner;

/**
 * 2.5 (Financial application: calculate tips)
 * Write a program that reads the sub-total and
 * the gratuity rate, then computes the gratuity and
 * total. For example, if the user enters 10 for sub-total
 * and 15% for gratuity rate, the program displays $1.5 as
 * gratuity and $11.5 as total.
 */
public class Problem02_05 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double subtotal,gratuityPercent,gratuity,total;

        System.out.print("Enter the subtotal and a gratuity rate: ");
        subtotal=input.nextDouble();
        gratuityPercent=input.nextDouble();

        gratuity=subtotal*(gratuityPercent/100);
        total=subtotal+gratuity;
        System.out.print("The gratuity is $"+gratuity);
        System.out.print(" and total is $"+total);

    }
}

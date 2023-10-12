package Ch_02;

// Created By: Reda Elsayed

import java.util.Scanner;

/**
 * 2.6 (Sum the digits in an integer)
 * Write a program that reads an integer between 0 and
 * 1000 and adds all the digits in the integer.
 * For example, if an integer is 932, the sum of all its digits is 14.
 * Here is a sample run:
 * Enter a number between 0 and 1000: 999
 * The sum of the digits is 27
 */

public class Problem02_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();
        int sumOfDigits=0;

        while (number>0){
            sumOfDigits+=number%10;
            number/=10;
        }
        System.out.println("The sum of the digits is "+sumOfDigits);


    }

}

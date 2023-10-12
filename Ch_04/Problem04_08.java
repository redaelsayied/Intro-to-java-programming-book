package Ch_04;


// Created By: Reda Elsayed
import java.util.Scanner;

/**
 * *4.8 (Find the character of an ASCII code) Write a program that receives an ASCII code
 * (an integer between 0 and 127) and displays its character. Here is a sample run:
 * Enter an ASCII code: 69
 * The character for ASCII code 69 is E
 */
public class Problem04_08 {
    public static void main(String[] args) {

        System.out.print("Please enter the ASCII code: ");
        Scanner input = new Scanner(System.in);

        int userInput = input.nextInt();

        System.out.println("The ASCII character for " + userInput + " is " + (char)userInput);

    }
}

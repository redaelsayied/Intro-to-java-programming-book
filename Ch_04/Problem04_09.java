package Ch_04;


// Created By: Reda Elsayed
import java.util.Scanner;

/**
 * *4.9 (Find the Unicode of a character) Write a program that receives a character and
 * displays its Unicode. Here is a sample run:
 * Enter a character: E
 * The Unicode for the character E is 69
 */
public class Problem04_09 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char myChar = in.next().charAt(0);

        System.out.println("The Unicode for the character " + myChar + " is " + (int) myChar);
    }
}
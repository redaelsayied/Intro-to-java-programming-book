package Ch_03;


// Created By: Reda Elsayed
import java.util.Scanner;

/**
 * 3.12 (Palindrome integer) Write a program that prompts the user to enter a three-digit
 * integer and determines whether it is a palindrome integer. An integer is palindrome
 * if it reads the same from right to left and from left to right. A negative integer is
 * treated the same as a positive integer. Here are sample runs of this program:
 * Enter a three-digit integer: 121
 * 121 is a palindrome
 * Enter a three-digit integer: 123
 * 123 is not a palindrome
 */
public class Problem03_12 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");

        String userInput=input.next();
        if(userInput.charAt(0)==userInput.charAt(2))
            System.out.println(userInput+" is a palindrome");
        else
            System.out.println(userInput+" is not a palindrome");

    }

}
/*  Another solution
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a three-digit integer: ");
        int userInput = input.nextInt();

        int numLast = startNum % 10;
        int numFirst = startNum / 100;

        if (numLast == numFirst) {
            System.out.println(userInput+" is a palindrome");
        } else
            System.out.println(userInput+" is not a palindrome");
*/
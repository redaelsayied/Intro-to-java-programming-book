package Ch_03;

// Created By: Reda Elsayed
import java.util.Scanner;

/**
 * **3.9 (Business: check ISBN-10) An ISBN-10 (International Standard Book Number)
 * consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum,
 * which is calculated from the other 9 digits using the following formula:
 * (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
 * d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9),11
 * If the checksum is 10, the last digit is denoted as X according to the ISBN-10
 * convention. Write a program that prompts the user to enter the first 9 digits and
 * displays the 10-digit ISBN (including leading zeros). Your program should read
 * the input as an integer. Here are sample runs:
 * VideoNote
 * Sort three integers
 * Enter the first 9 digits of an ISBN as integer: 013601267
 * The ISBN-10 number is 0136012671
 * Enter the first 9 digits of an ISBN as integer: 013031997
 * The ISBN-10 number is 013031997X
 */
public class Problem03_09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as an integer: ");
        String isbn = scanner.next();
        String fullISBN=isbn;

        // Calculate the checksum
        int checksum = 0;
        for (int i = 0; i < 9; i++) {
            int digit = Integer.parseInt(""+isbn.charAt(i));
            checksum += (digit * (i + 1));
        }

        // Determine the last digit of the ISBN
        if (checksum % 11 == 10) {
            fullISBN += 'X';
        } else {
            fullISBN  += checksum % 11;
        }

        System.out.println("The ISBN-10 number is " + fullISBN);
    }
}

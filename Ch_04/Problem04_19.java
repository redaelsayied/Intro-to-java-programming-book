package Ch_04;


// Created By: Reda Elsayed
import java.util.Scanner;

/*(Business: check ISBN-10) Rewrite Programming Exercise 3.9 by entering the
ISBN number as a string.*/
public class Problem04_19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;

        System.out.print("Enter the first 9 digits of the ISBN: ");
        String isbn = in.nextLine();

        if (isbn.length() != 9 || !isbn.matches("\\d+")) {
            System.out.println("Invalid input. Please enter exactly 9 digits.");
            return; // Exit the program if the input is invalid
        }

        for (int i = 0; i < 9; i++) {
            int num = Character.getNumericValue(isbn.charAt(i));
            sum += num * (i + 1);
        }

        int d10 = sum % 11;
        char lastDigit;

        if (d10 == 10) {
            lastDigit = 'X';
        } else {
            lastDigit = (char) ('0' + d10);
        }

        String isbn10 = isbn + lastDigit;
        System.out.println("The ISBN-10 is " + isbn10);
    }
}

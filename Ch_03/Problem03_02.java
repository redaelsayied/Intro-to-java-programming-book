package Ch_03;

// Created By: Reda Elsayed
import java.util.Scanner;

/**
 * 3.2 (Game: add three numbers) The program in Listing 3.1, AdditionQuiz.java, generates
 * two integers and prompts the user to enter the sum of these two integers.
 * Revise the program to generate three single-digit integers and prompt the user to
 * enter the sum of these three integers.
 *
 */
public class Problem03_02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a =(int)(Math.random()*10);
        int b = (int)(Math.random()*10);
        int c = (int)(Math.random()*10);

        int correctAnswer = a + b + c;

        System.out.print("Fill in your answer and then press enter: " + a + " + " +
                b + " + " + c + " = ");

        int userAnswer = input.nextInt();

        if (userAnswer == correctAnswer) {
            System.out.println("Congrats! That is correct!");
        } else
            System.out.println("That is incorrect, please try again");

    }
}

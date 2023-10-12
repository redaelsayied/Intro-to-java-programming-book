package Ch_03;


// Created By: Reda Elsayed
import java.util.Scanner;

/**
 * 3.14 (Game: heads or tails) Write a program that lets the user guess whether
 * the flip of a coin results in heads or tails. The program randomly generates
 * an integer 0 or 1, which represents head or tail. The program prompts the
 * user to enter a guess and reports whether the guess is correct or incorrect.
 */
public class Problem03_14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int randomInt=(Math.random()<.5)?0:1;

		System.out.print("Enter a guess 0 or 1 : ");
		int userInput=input.nextInt();

		if(userInput==randomInt)
			System.out.println("correct");
		else
			System.out.println("wrong");
	}
}

package Ch_03;

// Created By: Reda Elsayed
import java.util.Scanner;
/*
* 3.17 (Game: scissor, rock, paper) Write a program that plays the popular scissor–
rock–paper game. (A scissor can cut a paper, a rock can knock a scissor, and
a paper can wrap a rock.) The program randomly generates a number 0, 1, or
2 representing scissor, rock, and paper. The program prompts the user to enter
a number 0, 1, or 2 and displays a message indicating whether the user or the
computer wins, loses, or draws. Here are sample runs:
scissor (0), rock (1), paper (2): 1
The computer is scissor. You are rock. You won
scissor (0), rock (1), paper (2): 2
The computer is paper. You are paper too. It is a draw
* */
public class Problem03_17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        byte computerNumber = (byte) (Math.random() * 3);
        System.out.print("scissor (0), rock (1), paper (2): ");
        byte userInput = input.nextByte();

        if (userInput == 1 || userInput == 0 || userInput == 2) {
            printChoice(userInput, computerNumber);

            if (userInput == computerNumber)
                System.out.println("It is a draw");
            else if (userInput == 0 && computerNumber == 1)
                System.out.println("You Lose");
            else if (userInput == 0 && computerNumber == 2)
                System.out.println("You Win");
            else if (userInput == 1 && computerNumber == 0)
                System.out.println("You Win");
            else if (userInput == 1 && computerNumber == 2)
                System.out.println("You Lose");
            else if (userInput == 2 && computerNumber == 0)
                System.out.println("You Lose");
            else if (userInput == 2 && computerNumber == 1)
                System.out.println("You Win");
        } else {
            System.out.println("Invalid input");
        }
    }

    public static String getChoice(byte n) {
        String[] states = {"scissor", "rock", "paper"};
        return states[n];
    }

    public static void printChoice(byte userInput, byte computerNumber) {
        if (userInput == computerNumber)
            System.out.printf("The computer is %s. You are %s too. ", getChoice(computerNumber), getChoice(userInput));
        else
            System.out.printf("The computer is %s. You are %s. ", getChoice(computerNumber), getChoice(userInput));
    }
}

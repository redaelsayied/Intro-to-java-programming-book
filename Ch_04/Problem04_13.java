package Ch_04;

import java.util.Scanner;

// Created By: Reda Elsayed
/**
 * *4.13 (Vowel or consonant?) Write a program that prompts the user to enter a letter and
 * check whether the letter is a vowel or consonant. For a nonletter input, display
 * invalid input. Here is a sample run:
 * Enter a letter: B
 * B is a consonant
 * Enter a letter: a
 * a is a vowel
 * Enter a letter: #
 * # is an invalid input
 */
public class Problem04_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        char letter=input.next().charAt(0);

        if(isValidLetter(letter)){

            String state=getState(letter);
            System.out.println(letter+" is a "+state);

        }else {
            System.out.println(letter+" is an invalid input");
        }

    }

    public static boolean isValidLetter(char c){
        return c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
    }
    public static String getState(char letter){
        String vowelLetters="aeiouAEIOU";

        if(vowelLetters.contains(String.valueOf(letter))){
            return "vowel";
        }else {
            return "consonant";
        }

    }
}
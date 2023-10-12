package Ch_04;


// Created By: Reda Elsayed
import java.util.Scanner;

/*
 (Process a string) Write a program that prompts the user to enter a string and
 displays its length and its first character. */

public class Problem04_20 {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);

         System.out.println("Enter a string: ");
         String s = in.next();

         System.out.println("Length is " + s.length() + " First char is " + s.charAt(0) );
    }
}
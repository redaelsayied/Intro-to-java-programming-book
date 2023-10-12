package Ch_04;


// Created By: Reda Elsayed
import java.util.Scanner;

/**
 * *4.11 (Decimal to hex) Write a program that prompts the user to enter an integer between
 * 0 and 15 and displays its corresponding hex number. Here are some sample runs:
 * Enter a decimal value (0 to 15): 11
 * The hex value is B
 * Enter a decimal value (0 to 15): 5
 * The hex value is 5
 * Enter a decimal value (0 to 15): 31
 * 31 is an invalid input
 */
public class Problem04_11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a decimal value (0 to 15): ");
        byte userInput=input.nextByte();

        if(userInput<=15&&userInput>=0){
            printHexadecimal(userInput);
        }else {
            System.out.println(userInput+" is an invalid input");
        }

    }
    public static void printHexadecimal(byte n){
        String hex="";
        if(n<=9){
            hex=String.valueOf(n);
        }else{
            hex=String.valueOf((char)(n+55));
        }
        System.out.println("The hex value is "+hex);
    }
}
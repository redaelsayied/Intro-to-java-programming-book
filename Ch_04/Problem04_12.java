package Ch_04;


// Created By: @Reda Elsayed
/*
 * 4.12 (Hex to binary) Write a program that prompts the user to enter a hex digit and
 * displays its corresponding binary number. Here is a sample run:
 * Enter a hex digit: B
 * The binary value is 1011
 */

import java.util.Scanner;

public class Problem04_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        char hex = input.nextLine().toUpperCase().charAt(0);

        if (isValidHex(hex)) {
            int decimal = getDecimal(hex);
            String binary = getBinary(decimal);
            System.out.println("The binary value is " + binary);
        } else {
            System.out.println(hex + " is an invalid input");
        }
    }

    public static boolean isValidHex(char hex) {
        return (hex >= '0' && hex <= '9') || (hex >= 'A' && hex <= 'F');
    }

    public static int getDecimal(char hex) {
        if (hex <= '9') {
            return hex - '0';
        } else {
            return hex - 'A' + 10;
        }
    }

    public static String getBinary(int decimal){
        String binaryInreverse="";
        String binary = "";


        while (decimal>0){
            binaryInreverse+=decimal%2;
            decimal/=2;
        }

        for(int i=0;i<binaryInreverse.length();i++){
            binary+=binaryInreverse.charAt(binaryInreverse.length()-1-i);
        }

        return  binary;

    }
}

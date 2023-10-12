package Ch_04;

import java.util.Scanner;

/**
 * *4.14 (Convert letter grade to number) Write a program that prompts the user to enter a
 * letter grade A, B, C, D, or F and displays its corresponding numeric value 4, 3, 2,
 * 1, or 0. Here is a sample run:
 * Enter a letter grade: B
 * The numeric value for grade B is 3
 * Enter a letter grade: T
 * T is an invalid grade
 */
public class Problem04_14 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter a letter grade: ");
        char letter=input.next().charAt(0);
        String degree;

        switch (letter){
            case 'A':
                degree="4";
                break;
            case 'B':
                degree="3";
                break;
            case 'C':
                degree="2";
                break;
            case 'D':
                degree="1";
                break;
            case 'F':
                degree="0";
                break;
            default:
                degree=letter+" is an invalid grade";
        }

        if(degree.length()==1){
            System.out.println("The numeric value for grade "+letter+" is "+degree);
        }else {
            System.out.println(degree);
        }

    }
}
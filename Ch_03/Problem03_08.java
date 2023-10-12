package Ch_03;

// Created By: Reda Elsayed
import java.util.Scanner;

/**
 * 3.8 (Sort three integers) Write a program that prompts the user to enter three integers
 * and display the integers in non-decreasing order.
 */
public class Problem03_08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a three integers:");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        int max=maxNumber(x,y);
        max=maxNumber(max,z);

        System.out.println("max is "+max);
    }
    public  static int maxNumber(int x,int y){
        return x>y?x:y;
    }
}



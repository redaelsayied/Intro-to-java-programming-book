package Ch_04;

// Created By: Reda Elsayed
import java.util.Scanner;

/**
 * (Check SSN) Write a program that prompts the user to enter a Social Security
 * number in the format DDD-DD-DDDD, where D is a digit. Your program should
 * check whether the input is valid. Here are sample runs:
 * Enter a SSN: 232−23−5435
 * 232−23−5435 is a valid social security number
 * Enter a SSN: 23−23−5435
 * 23−23−5435 is an invalid social security number
 */
public class Problem04_21 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a SSN: ");
        String userInput= input.next();

        String []s=userInput.split("−");

        if(s[0].length()==3&&s[1].length()==2&&s[2].length()==4)
            System.out.println(userInput+" is a valid social security number");
        else
            System.out.println(userInput+" is an invalid social security number");

    }
}

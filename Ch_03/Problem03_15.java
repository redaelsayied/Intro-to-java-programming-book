package Ch_03;

// Created By: Reda Elsayed
import java.util.Scanner;

/**
 * **3.15 (Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a three digit integer. The program prompts the user to enter a three-digit integer and
 * determines whether the user wins according to the following rules:
 * 1. If the user input matches the lottery number in the exact order, the award is
 * $10,000.
 * 2. If all digits in the user input match all digits in the lottery number, the award
 * is $3,000.
 * 3. If one digit in the user input matches a digit in the lottery number, the award
 * is $1,000.
 */
public class Problem03_15 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String lottery= String.valueOf(100 + (int) (1000 * Math.random()));//n3n2n1


        System.out.print("Enter the three digit integer");
        String userGuessed=input.next();


        System.out.println("lottery is "+lottery);
        int matches=calculateMatches(lottery,userGuessed);

        if(userGuessed.equals(lottery))
            System.out.println("you win $10,000");
        else if(matches==3)
            System.out.println("you win $3,000");
        else if(matches>1)
            System.out.println("you win $1,000");
        else
            System.out.println("you lose");

    }
    public static  int calculateMatches(String s1,String s2) {
        int matches = 0;
        for (int i = 0; i < 3; i++) {
                if (s1.contains(String.valueOf(s2.charAt(i))))
                    matches++;
        }
        return matches;
    }
}

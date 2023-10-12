package Ch_03;

// Created By: Reda Elsayed
import java.util.Scanner;

/**
 * 3.10 (Game: addition quiz) Listing 3.3, SubtractionQuiz.java, randomly generates a
 * subtraction question. Revise the program to randomly generate an addition question with two integers less than 100.
 *
 */
public class Problem03_10 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number1=(int)(Math.random()*100);
        int number2=(int)(Math.random()*100);
        int correctResult=number1+number2;

        System.out.printf("what is the sum of %d + %d ? ",number1,number2);
        int userResult=input.nextInt();
        if(userResult==correctResult)
            System.out.println("Congrats! it is correct");
        else
            System.out.println("No it is wrong, the correct answer is : "+correctResult);

    }
}

package Ch_02;

// Created By: Reda Elsayed
import java.util.Scanner;

/**
 * 2.11 ((Population projection) Rewrite Programming Exercise 1.11 to prompt the user
 * to enter the number of years and display the population after the number of years.
 * Use the hint in Programming Exercise 1.11 for this program. Here is a sample
 * run of the program:
 * Enter the number of years: 5
 * The population in 5 years is 325932969
 */
public class Problem02_11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        final double SECONDS_EVERY_BIRTH = 7.0;
        final double SECONDS_EVERY_DEATH = 13.0;
        final double SECONDS_EVERY_IMMIGRANT = 45.0;
        final double NUMBER_OF_SECONDS_IN_YEAR=60*60*24*365;
        int currentPopulation=312_032_486;

        double birthPerYear=NUMBER_OF_SECONDS_IN_YEAR/SECONDS_EVERY_BIRTH;
        double deathPerYear=NUMBER_OF_SECONDS_IN_YEAR/SECONDS_EVERY_DEATH;
        double immigrantPerYear=NUMBER_OF_SECONDS_IN_YEAR/SECONDS_EVERY_IMMIGRANT;

        System.out.print("Enter the number of years:");
        int years=input.nextInt();

        for(int i=0;i<years;i++)
            currentPopulation+=birthPerYear-deathPerYear+immigrantPerYear;

        System.out.println("The population in "+years+" years is "+currentPopulation);


    }
}

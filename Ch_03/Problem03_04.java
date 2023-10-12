package Ch_03;

// Created By: Reda Elsayed
/**
 * (Random month) Write a program that randomly generates an integer between 1
 * and 12 and displays the English month names January, February, . . . , December
 * for the numbers 1, 2, . . . , 12, accordingly
 *
 */
public class Problem03_04 {
    public static void main(String[] args) {
        String [] months={"January","February","March","April","May","June","July",
                "August","September","October","November","December"};
        int randomMonthNumber=(int)(Math.random()*12);
        System.out.println(months[randomMonthNumber]);
    }

}
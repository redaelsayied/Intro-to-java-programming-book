package Ch_04;


// Created By: Reda Elsayed
/**
 * 4.16 (Random character) Write a program that displays a random uppercase letter
 * using the Math.random() method.
 */
public class Problem04_16 {
    public static void main(String[] args) {

        char randomCharacter= (char) ('A'+(('Z'-'A'+1)*Math.random()));

        System.out.println(randomCharacter);
    }

}

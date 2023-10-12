package Ch_03;


// Created By: Reda Elsayed
/**
 * 3.16 (Random point) Write a program that displays a random coordinate in a
 * rectangle. The rectangle is centered at (0, 0) with width 100 and height 200
 *
 */

public class Problem03_16 {
    public static void main(String[] args) {
        double randomX=-50+(100)*Math.random();
        double randomY=-100+(200)*Math.random();

        System.out.printf("( %f , %f )",randomX,randomY);


    }
}

package Ch_04;


// Created By: Reda Elsayed
/**
 * *4.25 (Generate vehicle plate numbers) Assume a vehicle plate number consists of three
 * uppercase letters followed by four digits. Write a program to generate a plate
 * number.
 */
public class Problem04_25 {
    public static void main(String[] args) {
        String plateNumber="";

        for(int i=0;i<3;i++)
            plateNumber+=getUppercaseChar();

        plateNumber+=getRandomFourNumbers();

        System.out.println(plateNumber);

    }
    public static char getUppercaseChar(){
        return (char) ('A'+('Z'-'A')*Math.random());
    }
    public static  int getRandomFourNumbers(){
        return 1000+(int)((10000-1000)*Math.random());
    }
}

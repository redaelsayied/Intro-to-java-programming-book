package Ch_03;


// Created By: Reda Elsayed
import java.util.Scanner;

/**
 * 3.1 (Algebra: solve quadratic equations) The two roots of a quadratic equation
 * ax2 + bx + c = 0 can be obtained using the following formula:
 * r1 = -b + 2b2 - 4ac
 * 2a
 * and r2 = -b - 2b2 - 4ac
 * 2a
 * b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the
 * equation has two real roots. If it is zero, the equation has one root. If it is negative, the equation has no real roots.
 * Write a program that prompts the user to enter values for a, b, and c and displays
 * the result based on the discriminant. If the discriminant is positive, display two
 * roots. If the discriminant is 0, display one root. Otherwise, display “The equation
 * has no real roots.”
 * Note you can use Math.pow(x, 0.5) to compute 2x. Here are some sample
 * runs:
 * think before coding
 * learn from mistakes
 * Enter a, b, c: 1.0 3 1
 * The equation has two roots −0.381966 and −2.61803
 *
 */
public class Problem03_01 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();

        double discriminant=calculateDiscriminant(a,b,c);

        if(discriminant >0)
            System.out.println("The equation has two roots "+calculateRoot1(a,b,c)+
                    " and " +calculateRoot2(a,b,c));
        else if (discriminant==0)
            System.out.println("The equation has one root "+calculateRoot1(a,b,c));
        else System.out.println("The equation has no real roots");
    }
    public static double calculateDiscriminant(double a,double b,double c){
        return Math.pow(b,2)-4*a*c;
    }
    public static double calculateRoot1(double a,double b,double c){
        return (-1*b+Math.sqrt(calculateDiscriminant(a,b,c)))/2*a;
    }
    public static double calculateRoot2(double a,double b,double c){
        return (-1*b-Math.sqrt(calculateDiscriminant(a,b,c)))/2*a;
    }
}

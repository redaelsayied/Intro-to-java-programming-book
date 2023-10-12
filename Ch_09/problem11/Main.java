package Ch_09.problem11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter a, b, c, d, e, f: ");
        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();
        double d=input.nextDouble();
        double e=input.nextDouble();
        double f=input.nextDouble();

        LinearEquation l=new LinearEquation(a,b,c,d,e,f);

        if(l.isSolved()){
            System.out.println("x is : "+l.getX());
            System.out.println("y is : "+l.getY());
        }else {
            System.out.println("The equation has no solution");
        }
    }
}

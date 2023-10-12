package Ch_09.problem10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a,b and c: ");

        double a=input.nextDouble();
        double b=input.nextDouble();
        double c=input.nextDouble();

        QuadraticEquation q1=new QuadraticEquation(a,b,c);

        if(q1.getDiscriminant()>0){
            System.out.println("The to roots are : ");
            System.out.println(q1.getRoot1()+" and "+q1.getRoot2());
        }else if(q1.getDiscriminant()==0){
            System.out.println("The equation have one root : "+q1.getRoot1());
        }else {
            System.out.println("The equation has no roots.");
        }
    }
}

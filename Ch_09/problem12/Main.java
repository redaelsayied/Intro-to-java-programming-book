package Ch_09.problem12;
import Ch_09.problem11.LinearEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter x1, y1, x2, y2, x3, y3, x4, y4:");
        double x1=input.nextDouble();
        double y1=input.nextDouble();

        double x2=input.nextDouble();
        double y2=input.nextDouble();

        double x3=input.nextDouble();
        double y3=input.nextDouble();

        double x4=input.nextDouble();
        double y4=input.nextDouble();

        MakeLineEquation line1= new MakeLineEquation(x1,y1,x2,y2);
        MakeLineEquation line2= new MakeLineEquation(x3,y3,x4,y4);

        LinearEquation l=new LinearEquation(line1.getA(),line1.getB(),
                        line2.getA(), line2.getB(),line1.getE(),line2.getE());

        if(l.isSolved()){
            System.out.printf("The intersecting point is at (%f, %f)",l.getX(),l.getY());
        }else {
            System.out.println("The two lines are parallel");
        }

    }
}

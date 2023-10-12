package Ch_03;


// Created By: Reda Elsayed
import java.util.Scanner;

/**
 * **3.22 (Geometry: point in a circle?) Write a program that prompts the user to enter a
 * point (x, y) and checks whether the point is within the circle centered at (0, 0)
 * with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the
 * circle, as shown in Figure 3.7a.
 * (Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10.
 * The formula for computing the distance is 2(x2 - x1)
 * 2 + (y2 - y1)
 * 2
 * . Test your
 * program to cover all cases.) Two sample runs are shown below:
 * Enter a point with two coordinates: 4 5
 * Point (4.0, 5.0) is in the circle
 * Enter a point with two coordinates: 9 9
 * Point (9.0, 9.0) is not in the circle
 */
public class Problem03_22 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x=input.nextDouble();
        double y=input.nextDouble();

        double distance=calculateDistance(x,y);

        String state="";

        if(distance<=10){
            state="in the circle";
        }else{
            state="not in the circle";
        }

        System.out.printf("Point (%.1f, %.1f) is %s ",x,y,state);


    }
    public  static double calculateDistance(double x,double y){
        return Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    }
}
package Ch_04;


// Created By: Reda Elsayed
/**
 * *4.6 (Random points on a circle) Write a program that generates three random points
 * on a circle centered at (0, 0) with radius 40 and displays three angles in a triangle
 * formed by these three points, as shown in Figure 4.4a. Display the angles in
 * degrees. (Hint: Generate a random angle a in radians between 0 and 2p, as shown
 * in Figure 4.4b and the point determined by this angle is rx
 * cos (a), rx
 * sin (a).)
 */

public class Problem04_06 {
    public static void main(String[] args) {

        // Generate random angles
        double randomAngle1 = getRandomAngle();
        double x1 = getX(randomAngle1);
        double y1 = getY(randomAngle1);

        double randomAngle2 = getRandomAngle();
        double x2 = getX(randomAngle2);
        double y2 = getY(randomAngle2);

        double randomAngle3 = getRandomAngle();
        double x3 = getX(randomAngle3);
        double y3 = getY(randomAngle3);

        // Calculate the distances between points
        double side1 = getDistance(x1, y1, x2, y2);
        double side2 = getDistance(x1, y1, x3, y3);
        double side3 = getDistance(x2, y2, x3, y3);

        // Calculate the angles of the triangle
        double angle1 = getAngle(side1, side2, side3);
        double angle2 = getAngle(side1, side3, side2);
        double angle3 = getAngle(side2, side3, side1);

        // Print the angles
        System.out.printf("The three angles are %.2f, %.2f, and %.2f degrees.", angle1, angle2, angle3);
    }

    public static double getRandomAngle() {
        return Math.random() * 2 * Math.PI;
    }

    public static double getX(double angle) {
        final double RADIUS = 40;
        return RADIUS * Math.cos(angle);
    }

    public static double getY(double angle) {
        final double RADIUS = 40;
        return RADIUS * Math.sin(angle);
    }

    public static double getDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public static double getAngle(double a, double b, double c) {
        double cosAngle = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b);
        double angle = Math.acos(cosAngle);

        return Math.toDegrees(angle);
    }

}

package Ch_04;


// Created By: Reda Elsayed
import java.util.Scanner;

/**
 * (Order three cities) Write a program that prompts the user to enter three cities
 * and displays them in ascending order. Here is a sample run:
 * Enter the first city: Chicago
 * Enter the second city: Los Angeles
 * Enter the third city: Atlanta
 * The three cities in alphabetical order are Atlanta Chicago
 * Los Angeles
 */
public class Problem04_24 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        String []cities=new String[3];

        System.out.print("Enter the first city: ");
        cities[0]=input.nextLine();

        System.out.print("Enter the second city: ");
        cities[1]=input.nextLine();

        System.out.print("Enter the third city: ");
        cities[2]=input.nextLine();

        for(int i=0;i<cities.length;i++){
            for(int j=i+1;j<cities.length;j++){
                if(cities[i].compareTo(cities[j])>0){
                    String temp=cities[i];
                    cities[i]=cities[j];
                    cities[j]=temp;
                }
            }
        }

        System.out.print("The three cities in alphabetical order are ");
        for(String e: cities)
            System.out.print(e+" ");

    }

}

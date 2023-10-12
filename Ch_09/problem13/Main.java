package Ch_09.problem13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array:");

        int row=input.nextInt();
        int col=input.nextInt();
        Location l=new Location(row,col);

        System.out.println("Enter the array: ");

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++)
                l.insert(input.nextDouble(),i,j);
        }

        System.out.println("The location of the largest element is "+l.getMaxValue());
        System.out.printf("at ( %d , %d )",l.getMaxRowIndex(),l.getMaxColIndex());

    }
}

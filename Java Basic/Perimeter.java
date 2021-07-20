/* Write a java program to input the length and width of a rectangle 
and calculate and print the perimeter */

import java.util.Scanner;

public class Perimeter {

    public static void main(String[] args) {

        int width;
        int length;
        int perimeter;

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter the Length :");
        length = myScanner.nextInt();

        System.out.print("Enter the Width :");
        width = myScanner.nextInt();

        perimeter = ((width + length) * 2);

        System.out.print("Perimeter is :" + perimeter);

    }

}
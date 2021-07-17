
/*Write a program that draws the following figures one above the other.
Exercise 6 (Time: 10 minutes)
Now modify the previous program to draw stars next to each other.
Exercise 7 (Time: 5 minutes)
Write a Java program to add two integers and display the sum and the average of two Integers.
Declare two integer variables to store the numbers to be added.
Using while loop       

* * * * *
* * * * *
* * * * *
* * * * *
* * * * *


Using for loop
    *
   * *
  * * *
 * * * *
* * * * *    */

public class Exercise5 {

    public static void main(String[] args) {

        int column = 0;
        int raw = 0;

        while (column < 5) {
            while (raw < 5) {
                System.out.print("* ");
                raw++;
            }
            System.out.println("* ");
            column++;
            raw = 0;
        }

    }

}

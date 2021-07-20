
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

public class Exercise5 { // Begining of Class

    public static void main(String[] args) { // Begining of Method

        // Declare Column and Raw Varilables

        int column = 0;
        int raw = 0;

        while (column < 5) { // Outter While Loop
            while (raw < 5) { // Inner while loop
                System.out.print("* "); // Statement
                raw++; // Raw Post Increment
            }
            System.out.println("* "); // Statement
            column++; // Column Post Increment
            raw = 0;

        } // End of While Loop

        System.out.println("");

        for (column = 0; column < 6; column++) { // Outter For Loop
            for (raw = 0; raw < 6 - column; raw++) { // Inner For Loop

                System.out.print(" ");

            }

            for (raw = 0; raw < column; raw++) {

                System.out.print("* "); // Print Statement
            }

            System.out.println("");
        } // End of For Loop

    } // End of Method

} // End of Class

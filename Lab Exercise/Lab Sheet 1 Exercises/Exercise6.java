
// Exercise 6

/*Now modify the previous program to draw stars next to each other.

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
* * * * *  */

public class Exercise6 { // Begining of Class

    public static void main(String[] args) { // Begining of Method

        // Declare Variables
        int column = 0;
        int raw = 0;

        for (column = 1; column <= 5; column++) { // Outter For Loop
            for (raw = 0; raw < 5; raw++) { // Inner For Loop

                System.out.print("* "); // Print Statement
            }

            System.out.print("\t");

            for (raw = 0; raw < 5 - column; raw++) { // For loop next statement

                System.out.print(" ");
            }

            for (raw = 0; raw < column; raw++) { // For loop next statement

                System.out.print("* ");

            }

            System.out.print("\n");
        } // End of For loop

    } // End of Method

} // End of Class

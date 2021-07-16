
// Exercise 7

/*Write a Java program to add two integers and display the sum and the average of two Integers.
Declare two integer variables to store the numbers to be added */

public class Exercise7 { // Begining of Class

    public static void main(String[] args) { // Begining of Method

        // Declare Variavbles

        int Number1 = 20;
        int Number2 = 30;
        int sum = 0;
        int average = 0;

        System.out.println("First Number  :" + Number1); // Dsiplay stored First Number
        System.out.println("Second Number :" + Number2); // Dsiplay stored Second Number

        sum = Number1 + Number2; // Calculate Sum of Stored two numbers

        System.out.println("The Sum of Two Number is :" + sum); // Out put of two Numbers sum

        average = sum / 2; // Calculate Average of Stored two numbers

        System.out.println("Average of Two Number is :" + average); // Out put of two numbers Average

    } // End of method

} // End of Class

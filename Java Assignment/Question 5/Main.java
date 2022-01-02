/* Write a Java application that allows the user to enter up to 20 integer grades into an array. Stop
the loop by typing in ‐1. Your main method should call an Average method that returns the
average of the grades. Use the DecimalFormat class to format the average to 2 decimal places */

// Question 05


import java.util.Scanner; // import Scanner class

public class Main{ // Beiginng of the main class

    public static void main(String[] args) { // method

        Scanner scanner = new Scanner(System.in); // create object scanner class

        int Array[];    //declaring array
        Array = new int[20];    //declaring array

        for(int i= 0; i<Array.length; i++){ // for loop

        System.out.print("Enter Number" +i+":"); // enter number
        int number = scanner.nextInt(); // user input

            if(number == -1) { // condition

                    break;
            }
        


        }
        
    }

}
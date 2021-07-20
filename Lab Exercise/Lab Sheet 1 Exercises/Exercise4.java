// Exercise 4

/*Write a program to display the day of the week when you provide the value.
Expected Output
Value of the day : 4
Day of the week : Thursday
Good Bye! */

public class Exercise4 { // Begining of class

    public static void main(String[] args) { // Begining of method

        // Declare Variables

        int dayNumber = 4;
        String day;

        System.out.println("Vaule of the day : " + dayNumber); // Statment

        switch (dayNumber) { // Switch- Case Statment

            case 1:
                day = "Monday"; // Check Case Statement
                break;

            case 2:
                day = "Tuesday"; // Check Case Statement
                break;

            case 3:
                day = "Wednesday"; // Check Case Statement
                break;

            case 4:
                day = "Thrusday"; // Check Case Statement
                break;

            case 5:
                day = "Friday"; // Check Case Statement
                break;

            case 6:
                day = "Saturday"; // Check Case Statement
                break;

            case 7:
                day = "Sunday"; // Check Case Statement
                break;

            default:
                day = "Invaild Day"; // Case Statement false

        }

        System.out.println("Day of the Week :" + day); // After Condition Display relevent Statment
        System.out.println("Good Bye!"); // Statement

    } // End of Method

} // End of Class

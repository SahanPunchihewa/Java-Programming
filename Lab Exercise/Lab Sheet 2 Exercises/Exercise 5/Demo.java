import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        int number;

        EvenOddNumber eon = new EvenOddNumber();

        // boolean result = eon.findEvenOrOdd(8);

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number :");
        number = input.nextInt();

        input.close();

        if (eon.findEvenOrOdd(number)) { // if(result == true)

            System.out.print("This is an Even Number");

        }

        else {

            System.out.print("This is an Odd Number");

        }

    }

}
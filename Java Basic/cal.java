import java.util.*;

public class cal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number1;
        int number2;

        System.out.print("Enter number 1 :");
        number1 = input.nextInt();

        System.out.print("Enter number 2 :");
        number2 = input.nextInt();

        int total = number1 + number2;

        System.out.print("Total is :" + total);

    }

}
public class MutipleCatch { // Multiple catch Class
 
        public static void main(String args[]) { // method

            try{ // try catch block

              int a = args.length;
               System.out.println("a = " +a);
               int b =42 /a;
                int c[] = {1};
                c[42] = 99;

            } catch (ArithmeticException e3) { // Exception

                System.out.println("Divide by 0 :" +e); // Print Exception
            }catch (ArrayIndexOutOfBoundsException ex) { // Catch Exception

                System.out.println("Array index oob :" +ex); // Print Exception
            }


                System.out.println("After try/ catch block");
        }



}

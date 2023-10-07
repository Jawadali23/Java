import java.util.Scanner;
public class Integer {
        public static void main(String[] args) {
            int x,y;
            //create scanner object to obtain input from keyword
            Scanner input = new Scanner(System.in);
            try {
                System.out.print("Enter first integer = ");
                x = input.nextInt(); //Read first integer
                System.out.print("Enter Second integer = ");
                y = input.nextInt(); //Read second integer
                System.out.println(x + "/" +y+" = "+(x/y));
            }
            catch(ArithmeticException e) {
                System.out.println("Denominator cannot be zero while integer division");
            }

        }
    }

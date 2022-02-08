import java.util.InputMismatchException;
import java.util.Scanner;
public class Exceptions {

    public int div (int a, int b) throws ArithmeticException {
        if (b == 0) {
            // Throw lets you manually generate exceptions
            throw new ArithmeticException("Cannot divide by 0!");
        } else {
            return a / b;
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int arr[] = {0, 1, 2};
        // Not possible to print element with index 5 - array has only 3 elements
        try {
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println("The array has only 3 elements. [0-2]");
        }
        // Handling many exceptions
        int a, b;
        try {
            a = scan.nextInt();
            b = scan.nextInt();
            System.out.println( a / b );
        } catch (ArithmeticException e1) {
            System.out.println("Error: Cannot divide by 0.");
        } catch (InputMismatchException e2) {
            System.out.println("Error: Wrong input provided.");
        }

        scan.close();
    }
}

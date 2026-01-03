import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {


    static int readInt() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter number : ");
            int num = sc.nextInt();
            return num;
        } catch (InputMismatchException ex) {
            throw new InputMismatchException("Invalid Input..");
        }
//        finally {
//            sc.close();
//        }

    }


    static void main() {


        boolean validA = false, validB = false;
        int a;
        int b;
        while (!validA) {
            try {
                a = readInt();
                System.out.println("First number (a): " + a);
                validA=true;
            } catch (InputMismatchException ex) {
                System.out.println(ex.getMessage());
                validA = false;
            }
        }
        while (!validB)
            try {
                b = readInt();
                System.out.println("Second number (b): " + b);
                validB=true;
            } catch (InputMismatchException ex) {
                System.out.println(ex.getMessage());
                validB = false;
            }
        }
    }






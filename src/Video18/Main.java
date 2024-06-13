package Video18;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        try (Scanner scanner = new Scanner(System.in)) {
            Test test1 = new Test();
            Test test2 = new Test();

            test2 = test1;

            System.gc();

            /*===================  compile time / checked exceptions =========================*/
//       IOExceptions
//       ClassNotFoundException
//       SQLException



            /*===================  runtime / unchecked exceptions =========================*/
            int a = 8 / 0;//ArithmeticException
            test2.printHi();

            System.out.println("helloooooooooooooooooooooooooo");

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        } finally {
            System.out.println("Finally block");

            scanner1.close();
        }

    }
}

package Video6;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        /*if (age < 18) {
            System.out.println("student");
        }else {
            System.out.println("not a student");
        }*/

        String value=(age < 18) ? "student" : "not a student";
        System.out.println(value);
    }
}

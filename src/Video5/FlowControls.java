package Video5;

import java.util.Scanner;

public class FlowControls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      /*  System.out.print("Input student age : ");
        int age = scanner.nextInt();
        *//*========================== flow control if ==========================*//*
        if (age < 18) {
            System.out.println("student");
        }

        if (age > 18) {
            System.out.println("not a student");
        }

        *//*========================== flow control if-else ==========================*//*
        if (age < 18) {
            System.out.println("student");
        } else {
            System.out.println("not a student");
        }
        System.out.println("ok");*/

        /*===================================== flow control if-else-if =======================================*/
        System.out.print("Input student mark : ");
        int mark = scanner.nextInt();

        if (75<mark){
            System.out.println("Grade A");
        }else if (65<mark){
            System.out.println("Grade B");
        }else if (55<mark){
            System.out.println("Grade C");
        }else if (35<mark){
            System.out.println("Grade S");
        }else {
            System.out.println("Fail");
        }

        System.out.println("ok");
    }
}

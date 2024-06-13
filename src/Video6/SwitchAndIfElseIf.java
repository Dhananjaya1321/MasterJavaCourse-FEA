package Video6;

import java.util.Random;
import java.util.Scanner;

public class SwitchAndIfElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

//        if (value == 0) {
//            System.out.println(0);
//        } else if (value == 1) {
//            System.out.println(1);
//        } else if (value == 2) {
//            System.out.println(2);
//        } else if (value == 3) {
//            System.out.println(3);
//        } else if (value == 4) {
//            System.out.println(4);
//        } else {
//            System.out.println(5);
//        }



        switch (value) {
            case 0:
                System.out.println(0);
                break;
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
                break;
            case 3:
                System.out.println(3);
                break;
            case 4:
                System.out.println(4);
                break;
            default:
                System.out.println(5);
                break;
        }

    }
}

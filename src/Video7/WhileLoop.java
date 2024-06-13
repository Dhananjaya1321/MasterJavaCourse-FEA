package Video7;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val = scanner.nextInt();
        int count = 0;


//        for (int j = 0; j < 10; j++) {
//            val = val / 2;
//            System.out.println(val);
//            count++;
//        }
        while (val != 0) {
            val = val / 2;
            System.out.println(val);
            count++;
        }
        System.out.println(count);
    }
}

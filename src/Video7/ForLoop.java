package Video7;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int val= scanner.nextInt();

        for (int j = 0; j < val; j++) {
            System.out.println((j+1)+". Hello");
        }
    }
}

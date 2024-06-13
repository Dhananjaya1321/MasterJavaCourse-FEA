package Video7.task;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value= scanner.nextInt();

        int tot=0;
        for (int i = 1; i <= value; i++) {
            tot+=i;
        }
        System.out.println(tot);
    }
}

package Video5;

import java.util.Scanner;

public class KeyboardInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input value 1 : ");
        int value1= scanner.nextInt();

        System.out.print("Input value 2 : ");
        int value2= scanner.nextInt();

        System.out.print("Input value 3 : ");
        int value3= scanner.nextInt();

        int sum=value1+value2+value3;
        System.out.println("\nSum : "+sum);
        System.out.println("\nAverage : "+(sum/(double)3));
    }
}

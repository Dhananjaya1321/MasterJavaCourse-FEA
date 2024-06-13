package Video6.task;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int value = random.nextInt(101);
        System.out.println("Random value : "+value);

//        if (value % 2 == 0) {
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//        }
        System.out.println((value%2==0)?"Even":"Odd");
    }
}

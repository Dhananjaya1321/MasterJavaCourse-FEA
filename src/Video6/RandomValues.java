package Video6;

import java.util.Random;

public class RandomValues {
    public static void main(String[] args) {
        Random random = new Random();

        int value= random.nextInt();
        System.out.println("Random value : "+value);

        int value1= random.nextInt(10);
        System.out.println("Random value between 0 and 9 : "+value1);

        int value2= random.nextInt(101-50)+50;
        System.out.println("Random value between 50 and 100 : "+value2);
    }
}

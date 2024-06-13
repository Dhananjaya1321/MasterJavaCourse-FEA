package video4;

public class IncrementerAndDecrementer {
    public static void main(String[] args) {
        int val1 = 0, val2 = 0;
        System.out.println(val1);//0

        System.out.println("======================== Incrementer ===========================");

        System.out.println("======================== Post Increment===========================");

        val1++;
        System.out.println(val1);//1

        System.out.println(val1++);//1

        System.out.println(val1);//2

        System.out.println("======================== Pre Increment===========================");
        System.out.println(val2);//0

        ++val2;

        System.out.println(val2);//1
        System.out.println(++val2);//2
        System.out.println(val2);//2


        System.out.println("==================================================================");
        int val3 = 3, val4 = 4;
        System.out.println(val3 + val4);
        System.out.println(++val3 + val4);//8

        System.out.println(val3);//4
        System.out.println(val4);//4

        System.out.println(val3++ + val4);//8
        System.out.println(val3);//5


        System.out.println("======================== Decrement ===========================");

        System.out.println("======================== Post Decrement===========================");
        int valDecrementPost = 0;
        valDecrementPost--;
        System.out.println(valDecrementPost);//-1
        System.out.println(valDecrementPost--);//-1
        System.out.println(valDecrementPost);//-2

        System.out.println("======================== Pre Decrement===========================");
        int valDecrementPre = 0;
        --valDecrementPre;
        System.out.println(valDecrementPre);//-1
        System.out.println(--valDecrementPre);//-2
        System.out.println(valDecrementPre);//-2

    }
}

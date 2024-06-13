package Video3;

public class ArithmeticOperations {
    public static void main(String[] args) {
        System.out.println("================================ Addition ====================================");
        System.out.println(10 + 10);//20
        System.out.println(1500 + 569.10);//2069.10
        System.out.println(-10 + 10);//0
        System.out.println(-80 + 10);//-70
        int val1 = 19, val2 = 80;
        System.out.println(val1 + val2);//99

        System.out.println("================================ Subtraction ====================================");
        System.out.println(100 - 80);//20
        System.out.println(val1 - val2);//-61
        System.out.println(val2 - val1);//61

        System.out.println("================================ Multiplication ====================================");
        System.out.println(10*10);//100
        System.out.println(11*2654);//29194
        System.out.println(-11*2654);//-29194


        System.out.println("================================ Division ====================================");
        System.out.println(100/2);//50
        System.out.println(101/2);//50
        System.out.println(102/2);//51
        System.out.println(103/2);//51
        System.out.println(103.0/2);//51.5

        System.out.println("================================= Modulus ===================================");
        System.out.println(100%2);//0
        System.out.println(101%2);//1
        System.out.println(102%2);//0
        System.out.println(103%2);//1
        System.out.println(103.0%2);//1
    }
}

package video4;

public class RelationalOperators {
    public static void main(String[] args) {
        System.out.println("\nGreater than : >");
        System.out.println("10>5 : " + (10 > 5));//true
        System.out.println("5>10 : " + (5 > 10));//false

        System.out.println("\nLess than : <");
        System.out.println("10<5 : " + (10 < 5));//false
        System.out.println("5<10 : " + (5 < 10));//true

        System.out.println("\nGreater than or equal : >=");
        System.out.println("5>=1 : " + (5 >= 1));//true
        System.out.println("5>=2 : " + (5 >= 2));//true
        System.out.println("5>=3 : " + (5 >= 3));//true
        System.out.println("5>=4 : " + (5 >= 4));//true
        System.out.println("5>=5 : " + (5 >= 5));//true
        System.out.println("5>=6 : " + (5 >= 6));//false
        System.out.println("5>=7 : " + (5 >= 7));//false

        System.out.println("\nLess than or equal: <=");
        System.out.println("5<=1 : " + (5 <= 1));//false
        System.out.println("5<=2 : " + (5 <= 2));//false
        System.out.println("5<=3 : " + (5 <= 3));//false
        System.out.println("5<=4 : " + (5 <= 4));//false
        System.out.println("5<=5 : " + (5 <= 5));//true
        System.out.println("5<=6 : " + (5 <= 6));//true
        System.out.println("5<=7 : " + (5 <= 7));//true

        System.out.println("\nEqual : ==");
        System.out.println("10 == 10 : "+(10==10));//true
        System.out.println("0 == 10 : "+(0==10));//false

        System.out.println("\nNot Equal : !=");
        System.out.println("10 != 10 : "+(10!=10));//false
        System.out.println("0 != 10 : "+(0!=10));//true

        System.out.println("=================================================");
        System.out.println("isuru"=="isuru");
        String name1="isuru";
        String name2="isuru";
        System.out.println(name1==name2);
        System.out.println("isuru"==name2);

        String name3 = new String("isuru");
        String name4 = new String("isuru");
        System.out.println(name3);//isuru
        System.out.println(name4);//isuru

        System.out.println(name3==name4);
        System.out.println(name3.equals(name4));

    }
}

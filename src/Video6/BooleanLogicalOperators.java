package Video6;

import java.util.Scanner;

public class BooleanLogicalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        int height = scanner.nextInt();

//        if (age < 18) {
//            if (height<5){
//                System.out.println("student");
//            }
//        }else {
//            if (height>5){
//                System.out.println("not a student");
//            }
//        }

//        if (age < 18 && height < 5) {
//            System.out.println("student");
//        }else {
//            System.out.println("not a student");
//        }

//        System.out.println((age < 18 && height < 5) ? "student" : "not a student");

        System.out.println("(A) age < 18 \t (B) height < 5 \t (A & B) age < 18 & height < 5 ");
        System.out.println((age < 18)+"\t"+(height < 5) +"\t"+(age < 18 & height < 5));
        System.out.println();
        System.out.println("(A) age < 18 \t (B) height < 5 \t (A & B) age < 18 | height < 5 ");
        System.out.println((age < 18)+"\t"+(height < 5) +"\t"+(age < 18 | height < 5));

        System.out.println(age==18);//true
        System.out.println(age!=18);//false

        System.out.println("======================================");
        System.out.println(true);//true
        System.out.println(false);//false

        System.out.println(!true);//false
        System.out.println(!false);//true
    }
}

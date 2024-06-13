package Video11;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Human isuru = new Human();
        Human kamal = new Human();

//        isuru.address = "Galle";
//        isuru.name = "Isuru";
//        isuru.age = 22;

        isuru.setNic("0000001");
        isuru.setName("isuru");
        isuru.setAge(22);
        isuru.setAddress("Galle");

        kamal.setNic("0000002");
        kamal.setName("kamal");
        kamal.setAge(2500000);
        kamal.setAddress("Galle");

//        System.out.println(isuru.getNic());
//        System.out.println(isuru.getAddress());
//        System.out.println(isuru.getAge());
//        System.out.println(isuru.getName());

        System.out.println(isuru);
        System.out.println(kamal);
    }
}

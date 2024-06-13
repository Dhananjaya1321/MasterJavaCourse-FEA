package Video19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
//        Demo demo = new Demo();
//        demo.start();
//
//        for (int i = 0; i < 1000; i++) {
//            System.out.println(i+" main");
//        }
//
//        Example example = new Example();
//        Thread thread = new Thread(example);
//        thread.start();

        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add("isuru");
        arrayList.add(44.0);
        arrayList.add(new Example());

        System.out.println(arrayList.get(0));//1
        System.out.println(arrayList.get(1));//isuru
        System.out.println(arrayList.get(2));//44.0
        System.out.println(arrayList.get(3));//


        arrayList.add(0,"A");

        System.out.println();

        System.out.println(arrayList.get(0));//A
        System.out.println(arrayList.get(1));//1
        System.out.println(arrayList.get(2));//isuru
        System.out.println(arrayList.get(3));//44.0
        System.out.println(arrayList.get(4));//

        System.out.println("Size of ArrayList : "+arrayList.size());


        arrayList.remove(4);
        System.out.println("Size of ArrayList : "+arrayList.size());

        /*=====================================================================================================*/
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(1);
        integerArrayList.add(1);
        integerArrayList.add(1);
        integerArrayList.add(1);
        integerArrayList.add(1);
        integerArrayList.add(1);


        /*=====================================================================================================*/
        System.out.println("====================== HashMap ================================");
        HashMap<String,Integer> hashMap = new HashMap();
        hashMap.put("a",10);
        hashMap.put("b",20);
        hashMap.put("c",30);

        System.out.println(hashMap.get("a"));
        System.out.println(hashMap.get("b"));
        System.out.println(hashMap.get("c"));
    }
}

package Video10;

public class Continue {
    public static void main(String[] args) {
      label:
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                System.out.println("ok");
                continue label;
//                break;
            }
            System.out.println(i);

        }

        System.out.println("aaa");
    }
}

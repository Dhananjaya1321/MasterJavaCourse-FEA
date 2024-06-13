package Video17;

public class Main {
    public static void main(String[] args) {
        List list = new List();
        List.Node node = list.new Node();

        list.printHelloOuterClass();
        node.printHelloInnerClass();

        List.StaticInnerClass staticInnerClass = new List.StaticInnerClass();
        staticInnerClass.printHelloStaticInnerClass();

        Colors colors=Colors.GREEN;
        switch (colors){
            case RED: System.out.println(Colors.RED);break;
            case BLUE: System.out.println(Colors.BLUE);break;
            case BLACK: System.out.println(Colors.BLACK);break;
            case GREEN: System.out.println(Colors.GREEN);break;
            case WHITE: System.out.println(Colors.WHITE);break;
        }


    }

    Customer customer = new Customer() {
        public void play1() {
            System.out.println("Play1");
        }

        public void play2() {
            System.out.println("Play2");
        }

        public void play3() {
            System.out.println("Play3");
        }
    };

    Human human = ()-> {
        System.out.println("I am Isuru");
    };
}

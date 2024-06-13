package Video17;

public class List {

    Node node = new Node();
    StaticInnerClass staticInnerClass = new StaticInnerClass();


    public void printHelloOuterClass() {
        System.out.println("Hello Outer Class");
    }

    public class Node {
        public void printHelloInnerClass() {
            System.out.println("Hello Inner Class");
        }
    }

    public static class StaticInnerClass {
        public void printHelloStaticInnerClass() {
            System.out.println("Hello Static Inner Class");
        }
    }
}

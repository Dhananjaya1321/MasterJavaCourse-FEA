package Video14;

public class Cat implements AnimalInterface,Test {

    public void test(){
        final String test;
        test="Test";
        System.out.println(test);
//        Test="aaaa";
    }

    @Override
    public void move() {
        System.out.println("cats can run");
    }

    @Override
    public void age(int age) {
        System.out.println(age);
    }
}

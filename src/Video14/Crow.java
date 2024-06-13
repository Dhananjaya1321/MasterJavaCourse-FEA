package Video14;

public class Crow implements AnimalInterface,Test {

    @Override
    public void move() {
        System.out.println("crows can fly");
    }

    @Override
    public void age(int age) {
        System.out.println(age);
    }
}

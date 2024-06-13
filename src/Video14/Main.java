package Video14;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.age(5);
        cat.move();

        Crow crow = new Crow();
        crow.age(2);
        crow.move();

        String name = AnimalInterface.name;

    }
}

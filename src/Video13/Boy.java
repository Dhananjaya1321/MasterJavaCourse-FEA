package Video13;

public class Boy extends Human{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public Boy() {
        System.out.println("boy constructor");
    }

    public Boy(String name, int age) {
        super();
        System.out.println("boy parameterized constructor");
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

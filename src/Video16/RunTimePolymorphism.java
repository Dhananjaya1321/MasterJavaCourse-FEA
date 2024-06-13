package Video16;

public class RunTimePolymorphism extends RunTimePolymorphismSuperClass implements RunTimePolymorphismInterface{

    @Override
    public void printValue() {
        System.out.println("Run Time Polymorphism");
    }

    @Override
    public String printName(String name) {
        return "I'm "+name;
    }

    @Override
    public String printAge(int age) {
        return age+" years old";
    }
}

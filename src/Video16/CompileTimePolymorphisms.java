package Video16;

public class CompileTimePolymorphisms {
    public void printValue(){
        System.out.println("non-parameterized print value method");
    }

    public void printValue(String name){
        System.out.println(name);
    }

    public void printValue(int age){
        System.out.println(age);
    }

    public void printValue(String name,int age){
        System.out.println("I'm "+name+". "+age+" years old");
    }
}

package Video16;

public class Main {
    public static void main(String[] args) {
        CompileTimePolymorphisms compileTimePolymorphisms = new CompileTimePolymorphisms();

        /*=========================== compile time polymorphism ========================*/
        compileTimePolymorphisms.printValue();
        compileTimePolymorphisms.printValue("Isuru");
        compileTimePolymorphisms.printValue(22);
        compileTimePolymorphisms.printValue("Isuru", 22);

        System.out.println();

        /*=========================== run time polymorphism ========================*/
        RunTimePolymorphismSuperClass runTimePolymorphismSuperClass = new RunTimePolymorphism();
        System.out.println(runTimePolymorphismSuperClass.printAge(22));

        RunTimePolymorphismInterface runTimePolymorphismInterface = new RunTimePolymorphism();
        System.out.println(runTimePolymorphismInterface.printName("Dhananaya"));
        runTimePolymorphismInterface.printValue();

        System.out.println();

        /*=========================== wrapper classes ========================*/
        byte b;
        Byte B=new Byte((byte) 5);
        Byte BB=5;

        short s;
        Short S=new Short((short) 1);
        Short SS=1;

        int i=80;
        Integer I=new Integer(i);
        Integer ii=43;
        int iii=I;

        long l;
        Long L=new Long(5);

        char c;
        Character C=new Character('d');

        float f;
        Float F=new Float(5);

        double d;
        Double D=new Double(5);

        boolean bo;
        Boolean Bo=new Boolean(true);
        Boolean BOO=true;

    }
}

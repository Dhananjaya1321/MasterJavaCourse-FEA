package Video18;

public class Test {
    @Override
    protected void finalize() throws Throwable {

        System.out.println("Goodbye" + (1 + 2));
    }

    public void printHi() throws ArrayIndexOutOfBoundsException {
        int[] arr = new int[2];
        arr[2] = 10;//ArrayIndexOutOfBoundsException

        System.out.println("Hi");
    }
}

package Video19;

public class Example implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 1500; i++) {
            System.out.println(i+" Example");
        }
    }
}

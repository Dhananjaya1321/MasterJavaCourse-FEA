package Video19;

public class Demo extends Thread{

    public void run(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(i+" demo");
        }
    }
}

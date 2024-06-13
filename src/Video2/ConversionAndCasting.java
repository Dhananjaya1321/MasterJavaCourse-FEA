package Video2;

public class ConversionAndCasting {
    public static void main(String[] args) {
        byte b=10;// bit 8
        short s=20;// bit 16
        int i=20;// bit 32
        long l=20;// bit 64

//        b=s;
        s=b;

        char c='a';//bit 16
//        i=c;
        l=c;
        System.out.println(i);
        System.out.println(l);

        double d=10;
        d=i;
        System.out.println(d);
    }
}

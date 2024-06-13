package Video8;

public class Methods {
    public static void main(String[] args) {
        int a=6,b=9;
        int sum = sum(a, b);
        System.out.println(sum);

        System.out.println(sum(1,2,3));
        System.out.println(sum(5.0,8.2));

        int z = z(a, b);
        int multiplication = multiplication(a, b);
        System.out.println(z);
        System.out.println(multiplication);


        multiplication = multiplication(2, 3);
        System.out.println(multiplication);


        double average = average(sum, 2);
        System.out.println(average);
    }

    public static int sum(int a,int b){
        return a+b;
    }

    public static double sum(double a,double b){
        return a+b;
    }

    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    public static int z(int a,int b){
        return (a>b)?a-b:b-a;
    }

    public static int multiplication(int a,int b){
       return a*b;
    }

    public static double average(int sum,int valuesCount){
       return (double) sum/valuesCount;
    }
}

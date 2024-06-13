package Video9;

public class ArraysWithLoop {
    public static void main(String[] args) {
        int[] array = {15, 5, 8, 90, 50, 80, 1};

        System.out.println("length of array : "+array.length);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        System.out.println("for loop : "+sum);

        int arraySum = printArraySum(array);
        System.out.println("return value : "+arraySum);

    }

    public static int printArraySum(int[] arr){
        int sum = 0;
        for (int a : arr) {
            sum += a;//sum=sum+a
        }
        System.out.println("for each loop : "+sum);
        return sum;
    }
}

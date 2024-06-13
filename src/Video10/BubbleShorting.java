package Video10;

public class BubbleShorting {
    public static void main(String[] args) {
        int[] arr = {50, 40, 8, 9, 10, 0, 1, 800, 70, 57};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - (1 + i); j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        for (int a : arr) {
            System.out.print(a + ", ");
        }
        System.out.println("\b\b");
    }
}

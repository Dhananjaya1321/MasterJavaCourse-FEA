package Video10;

public class MultiDimensionArrays {
    public static void main(String[] args) {
        int[][] arr=new int[2][4];

        arr[0][0]=10;
        arr[0][1]=20;
        arr[0][2]=30;
        arr[0][3]=40;

        arr[1][0]=50;
        arr[1][1]=60;
        arr[1][2]=70;
        arr[1][3]=80;


        System.out.println(arr[0][0]);
        System.out.println(arr[0][3]);
        System.out.println(arr[1][1]);

        for (int[] a:arr){
            for (int b: a){
                System.out.println(b);
            }
        }


        /*=============== 3D Array =================*/
        int[][][] a=new int[2][3][4];
    }
}

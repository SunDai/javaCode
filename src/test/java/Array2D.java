import java.util.Scanner;

/**
 * Created by xh on 2015/11/2.
 */
public class Array2D {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int[][] arr = new int[6][6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0;i<6;i++){
            for (int j = 0;j<6;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0 ;
        for (int i = 1;i<5;i++){
            for (int j = 1;j<5;j++){
                int temp = arr[i][j]+arr[i-1][j]+arr[i+1][j]+arr[i-1][j-1]+arr[i-1][j+1]+arr[i+1][j+1]+arr[i+1][j-1];
                if (i==1 && j ==1){
                    sum = temp;
                    continue;
                }
                if (temp>sum){
                    sum = temp;
                }
            }
        }
        System.out.println(sum);
    }

    public static void printArray(int[][] arr){
        for (int i=0;i<arr.length;i++){
            for (int j = 0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

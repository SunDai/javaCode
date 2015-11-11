package hackerrank.java;

import java.util.Scanner;

/**
 * Created by xh on 2015/10/30.
 */
public class ArrayNegtiveSubNum {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n+2];
        for (int i = 0;i<n;i++){
            array[i] = sc.nextInt();
        }
        int nums = 0;
        for (int i = 0;i<n;i++){
            for (int j = n-1;j>=i;j--){
                int sum = 0;
                for (int k = i;k<=j;k++){
                    sum += array[k];
                }
                if (sum<0){
                    nums++;
                }
            }
        }
        System.out.println(nums);
    }
}

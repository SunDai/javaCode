package hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by xh on 2015/11/13.
 */
public class ServiceLane {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for (int k = 0;k<t;k++){
            int i = sc.nextInt();
            int j = sc.nextInt();
            int small = 3;
            for (int m = i;m<=j;m++){
                if (arr[m]==1){
                    small =1;
                    break;
                }
                if (arr[m]<small){
                    small = arr[m];
                }
            }
            System.out.println(small);
        }
    }
}

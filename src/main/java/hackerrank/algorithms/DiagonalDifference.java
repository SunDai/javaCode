package hackerrank.algorithms;

import java.util.Scanner;

/**
 * Created by xh on 2015/11/10.
 */
public class DiagonalDifference {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int pos = 0,neg = 0;
        for (int i = 0;i<n;i++){
            pos += arr[i][i];
            neg += arr[i][n-1-i];
        }
        int diff = pos-neg>=0?pos-neg:neg-pos;
        System.out.println(diff);
    }
}

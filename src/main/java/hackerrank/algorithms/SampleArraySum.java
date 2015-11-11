package hackerrank.algorithms;

import java.util.Scanner;

/**
 * Created by xh on 2015/11/10.
 */
public class SampleArraySum {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0;i<n;i++){
            int a = sc.nextInt();
            sum += a;
        }
        System.out.println(sum);
    }
}

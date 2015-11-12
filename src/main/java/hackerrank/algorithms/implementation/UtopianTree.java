package hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by xh on 2015/11/12.
 */
public class UtopianTree {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0;i<t;i++){
            int n = sc.nextInt();
            int ss = n%2;
            int move  = ss == 0?n/2+1:(n+1)/2+1;
            long nn = 0;
            if (ss == 0){
                nn = (1<<move) -1;
            }else {
                nn = (1<<move)-2;
            }
            System.out.println(nn);
        }
    }
}

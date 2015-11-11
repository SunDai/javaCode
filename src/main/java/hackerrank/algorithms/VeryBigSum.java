package hackerrank.algorithms;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by xh on 2015/11/10.
 */
public class VeryBigSum {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger sum = BigInteger.valueOf(0);

        for (int i =0;i<n;i++){
            String a = sc.next();
            BigInteger as = new BigInteger(a);
            sum = sum.add(as);
        }
        System.out.println(sum);
    }
}

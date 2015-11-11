package hackerrank.java;

import java.util.Scanner;

/**
 * Created by xh on 2015/10/29.
 */
public class StirngIntroduction {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println((A.length()+B.length()));

        String larger = A.compareTo(B)>0 ? "Yes" : "No";
        System.out.println(larger);
        char[] a =A.toCharArray();
        char[] b =B.toCharArray();
        a[0]= (char) (a[0]-32);
        b[0]= (char) (b[0]-32);
        A = String.valueOf(a);
        B = String.valueOf(b);
        System.out.println(A+" "+B);
        /* Enter your code here. Print output to STDOUT. */

    }
}

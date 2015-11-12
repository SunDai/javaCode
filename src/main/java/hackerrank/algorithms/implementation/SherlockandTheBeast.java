package hackerrank.algorithms.implementation;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by xh on 2015/11/12.
 */
public class SherlockandTheBeast {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0;i<t;i++){
            int n = sc.nextInt();
            if (n == 1||n == 2||n == 4||n == 7){
                System.out.println(-1);
                continue;
            }
            if (n%3 == 0){
                make(n/3, 0);
            }else {
                int w = n%15;
                switch (w%3){
                    case 1:{
                        make((n - 10)/3, 2);
                        break;
                    }
                    case 2:{
                        make((n-5)/3,1);
                        break;
                    }
                }
            }
//            System.out.println(s);
        }
    }

    public static void   make(int a,int b){
        int i = 0;
        for ( i = 0;i<a;i++){
            System.out.print(555);
        }
        for (i = i;i<a+b;i++){
            System.out.print(33333);
        }
        System.out.println();
    }
}

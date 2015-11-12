package hackerrank.algorithms.implementation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by xh on 2015/11/12.
 */
public class FindDigits {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0;i<t;i++){
            int n = sc.nextInt();
            int size =0;
            int q = n;
            while (n>0){
                int s  = n%10;
                if (s != 0 && q%s ==0){
                    size++;
                }
                n = n/10;
            }
            System.out.println(size);
        }
    }
}

package hackerrank.java;

import java.util.Scanner;

/**
 * Created by xh on 2015/10/29.
 */
public class StringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char[] chars = A.toCharArray();

        for (int i = 0;i<(chars.length/2);i++){
            if (chars[i] != chars[chars.length-i-1]){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}

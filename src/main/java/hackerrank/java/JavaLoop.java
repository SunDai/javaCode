package hackerrank.java;

import java.util.Scanner;

/**
 * Created by xh on 2015/10/29.
 */
public class JavaLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        for (int i=0;i<lines;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            String s = "";
            int num = 0;
            for (int j=0;j<n;j++){
                int r = 1<<j;
                num = num+r*b;
                s = s.concat((a+num)+" ");
            }
            System.out.println(s.substring(0, s.length() - 1));
        }
    }
}

package hackerrank.java;

import java.util.Scanner;

/**
 * Created by xh on 2015/10/29.
 */
public class JavaPrintFormat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.println(String.format("%-15s",s1)+String.format("%03d",x));
        }
        System.out.println("================================");

    }
}

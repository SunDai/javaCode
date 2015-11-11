package hackerrank.java;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by xh on 2015/10/30.
 */
public class JavaBigDecimal {
    public static void main(String []argh)
    {
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++)
        {
            s[i]=sc.next();
        }

        //Write your code here
        for (int i = 0;i<n;i++){
            for (int j=i+1;j<n;j++){
                BigDecimal a = new BigDecimal(s[i]);
                BigDecimal b = new BigDecimal(s[j]);
                if (a.compareTo(b)<0){
                    String tem = s[i];
                    s[i] = s[j];
                    s[j] = tem;
                }
            }
        }

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }

    }
}

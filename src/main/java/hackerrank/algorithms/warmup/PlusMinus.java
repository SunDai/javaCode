package hackerrank.algorithms.warmup;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by xh on 2015/11/10.
 */
public class PlusMinus {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        double a = 0.0,b = 0.0,c = 0.0;
        for (int i = 0;i<n;i++){
            int s = sc.nextInt();
            if (s>0){
                a++;
            }else if (s==0){
                b++;
            }else {
                c++;
            }
        }
        DecimalFormat df  = new DecimalFormat("#.###");
        System.out.println(df.format(a/n));
        System.out.println(df.format(c/n));
        System.out.println(df.format(b/n));
    }
}

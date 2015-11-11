package hackerrank.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by xh on 2015/11/2.
 */
public class JavaArrayList {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0;i<n;i++){
            List<Integer> l = new ArrayList<Integer>();
            int d = sc.nextInt();
            for (int j = 0;j<d; j++){
                int num = sc.nextInt();
                l.add(num);
            }
            list.add(l);
        }
        int q = sc.nextInt();
        for (int i = 0;i<q;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            int result ;
            try {
                result = list.get(x-1).get(y-1);
                System.out.println(result);
            }catch (Exception e){
                System.out.println("ERROR!");
            }
        }
    }
}

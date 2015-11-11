package hackerrank.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by xh on 2015/10/29.
 */
public class StringCompare {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();
        char[] chars = str.toCharArray();
        if (chars.length<=k){
            System.out.println(str);
            System.out.println(str);
            return;
        }
        Set<String> min = new HashSet<String>();
        Set<String> max = new HashSet<String>();
        String tempMin = null;
        String tempMax = null;

        for (int i = k;i<=chars.length;i++){
            if (i==k){
                String a = str.substring((i - k), i);
                min.add(a);
                tempMin = a;
                max.add(a);
                tempMax = a;
                continue;
            }
            String now = str.substring((i - k), i);
            if (now.compareTo(tempMin)<0){
                tempMin = now;
                min.clear();
                min.add(tempMin);
            }else if (now.compareTo(tempMin)==0){
                min.add(now);
            }
            if (now.compareTo(tempMax)>0){
                tempMax = now;
                max.clear();
                max.add(tempMax);
            }else if (now.compareTo(tempMax)==0){
                max.add(now);
            }
        }
        for (String s:min){
            System.out.println(s);
        }
        for (String s:max){
            System.out.println(s);
        }
    }
}

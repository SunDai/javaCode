package hackerrank.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by xh on 2015/11/2.
 */
public class JavaHashSet {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        sc.nextLine();
        Set<String> set = new HashSet<String>();
        for (int i = 0;i<lines;i++){
            String s = sc.nextLine();
            set.add(s);
            System.out.println(set.size());
        }
    }
}

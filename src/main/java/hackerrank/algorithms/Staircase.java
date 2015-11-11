package hackerrank.algorithms;

import java.util.Scanner;

/**
 * Created by xh on 2015/11/11.
 */
public class Staircase {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String blank = "";
        String sharp = "";
        for (int i = 0;i<n;i++){
            blank = blank.concat(" ");
            sharp = sharp.concat("#");
        }
        for (int i = n-1;i>=0;i--){
            String first = blank.substring(0,i);
            String last = sharp.substring(0,n-i);
            System.out.println(first+last);
        }
    }
}

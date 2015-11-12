package hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by xh on 2015/11/11.
 */
public class AngryProfessor {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0;i<t;i++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            String ints = sc.nextLine();
            String[] intarrStr = ints.split(" ");
            int value = 0;
            for (int j = 0;j<n;j++){
                int in = Integer.parseInt(intarrStr[j]);
                if (in<= 0){
                    value++;
                }
            }
            String result = value>=k?"NO":"YES";
            System.out.println(result);
        }
    }
}

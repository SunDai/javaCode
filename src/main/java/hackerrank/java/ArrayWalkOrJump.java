package hackerrank.java;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by xh on 2015/10/30.
 *
 * µÝ¹é´ó·¨ºÃ
 */
public class ArrayWalkOrJump {
    public static void main(String[] args) {
/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0;i<t;i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] array = new int[n];
            for (int j = 0; j < n; j++) {
                array[j] = sc.nextInt();
            }
            Set<Integer> zeros = new HashSet<Integer>();
            for (int j = 0;j<array.length;j++){
                if (array[j] == 0){
                    zeros.add(j);
                }
            }
            steps.clear();
            steps.add(0);
            boolean result = walkThrough(0,zeros,steps,array.length,m);
            System.out.println(result?"YES":"NO");
        }
    }

    public static Set<Integer> steps = new HashSet<Integer>();

    public static boolean walkThrough(int location ,Set<Integer> zeros,Set<Integer> steps,int length,int m){
        if (location +1>=length || location+m>=length){
            return true;
        }else {
            boolean one = false,two = false,three = false;
            if (zeros.contains(location+1) && !steps.contains(location+1)){
                steps.add(location+1);
                one = walkThrough(location+1,zeros,steps,length,m);
            }
            if (zeros.contains(location-1) && !steps.contains(location-1) && location>1){
                steps.add(location-1);
                two = walkThrough(location-1,zeros,steps,length,m);
            }
            if (zeros.contains(location+m) && !steps.contains(location+m)){
                steps.add(location+m);
                three = walkThrough(location+m,zeros,steps,length,m);
            }
            if (!zeros.contains(location+1)&& !zeros.contains(location-1)&& !zeros.contains(location+m)){
                return false;
            }
            return (one||two||three);
        }
    }

}

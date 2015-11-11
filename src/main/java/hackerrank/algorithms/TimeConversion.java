package hackerrank.algorithms;

import java.util.Scanner;

/**
 * Created by xh on 2015/11/11.
 */
public class TimeConversion {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String timeStr = sc.next();
        String timeS = timeStr.substring(0, 8);
        String timeSign = timeStr.substring(8,10);
//        System.out.println(timeS+"==========="+timeSign);
        String[] ss = timeS.split(":");
        if (timeSign.equals("AM")){
            if (ss[0].equals("12")){
                System.out.println("00:"+ss[1]+":"+ss[2]);
            }else {
                System.out.println(timeS);
            }
        }else if (timeSign.equals("PM")){
            if (ss[0].equals("12")){
                System.out.println("12:"+ss[1]+":"+ss[2]);
            }else {

                int pmInt = Integer.parseInt(ss[0]);
                pmInt += 12;
                String result = pmInt+":"+ss[1]+":"+ss[2];
                System.out.println(result);
            }
        }
    }
}

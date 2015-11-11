package hackerrank.java;

import java.util.Scanner;

/**
 * Created by xh on 2015/10/30.
 */
public class StringRegex {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext())
        {
            String IP = in.next();
            System.out.println(IP.matches(new myRegex().pattern));
        }
    }
}

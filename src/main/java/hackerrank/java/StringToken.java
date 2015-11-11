package hackerrank.java;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by xh on 2015/10/30.
 */
public class StringToken {

    public static void main(String[] args)
    {


        Scanner scan = new Scanner(System.in);
        String s=scan.nextLine();
        //Complete the code

//        String[] sa = s.split("\\s,!,\\,,?,.,\\_,',@");
        StringTokenizer tokenizer = new StringTokenizer(s," !,?._'@");
        List<String> chars = new LinkedList<String>();
        int count = 0;
        while (tokenizer.hasMoreElements()){
            chars.add(tokenizer.nextToken());
            count++;
        }
        System.out.println(count);
        for (String ss:chars){
            System.out.println(ss);
        }
//        System.out.println(sa.length);
//
//        for (int i = 0;i<sa.length;i++){
//            System.out.println(sa[i]);
//        }

    }

}

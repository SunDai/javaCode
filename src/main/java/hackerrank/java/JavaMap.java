package hackerrank.java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by xh on 2015/11/2.
 */
public class JavaMap {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        Map<String,Integer> map = new HashMap<String, Integer>();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            map.put(name,phone);
            in.nextLine();
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            String result = null;
            if (map.containsKey(s)){
                result = s+"="+map.get(s);
            }else {
                result = "Not found";
            }
            System.out.println(result);
        }
    }
}

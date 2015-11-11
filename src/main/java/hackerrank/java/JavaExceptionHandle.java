package hackerrank.java;

import java.util.Scanner;

/**
 * Created by xh on 2015/11/2.
 */

class myCalculator{
    int power(int a,int b)throws Exception{
        if (a <0|| b<0){
            throw new Exception("n and p should be non-negative");
        }
        return (int) Math.pow(a,b);
    }
}

class JavaExceptionHandle {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);

        while(in.hasNextInt())
        {
            int n = in.nextInt();
            int p = in.nextInt();
            myCalculator M = new myCalculator();
            try
            {
                System.out.println(M.power(n,p));
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }

    }
}

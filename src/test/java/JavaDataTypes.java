import java.util.Scanner;

/**
 * Created by xh on 2015/10/29.
 */
public class JavaDataTypes {
    public static void main(String []argh)
    {



        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if (x>=Short.MIN_VALUE && x<=Short.MAX_VALUE)System.out.println("* short");
                if (x>=-2147483648 && x<2147483647)System.out.println("* int");
                if (x>=-9223372036854775808l&& x<9223372036854775807l)System.out.println("* long");
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }
}

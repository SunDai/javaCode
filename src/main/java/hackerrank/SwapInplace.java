package hackerrank;

/**
 * Created by xh on 2016/1/18.
 */
public class SwapInplace {
    public static void main(String[] args){
        int  a = 7,b = 9;
        a = a^b;
        System.out.println("a = "+a+" b = "+b);
        b = a^b;
        System.out.println("a = "+a+" b = "+b);
        a = a^b;
        System.out.println("a = "+a+" b = "+b);
    }
}

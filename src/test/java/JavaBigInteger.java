import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by xh on 2015/10/30.
 */
public class JavaBigInteger {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        BigInteger a = new BigInteger(A);
        BigInteger b = new BigInteger(B);

        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}

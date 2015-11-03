import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by xh on 2015/11/2.
 */
public class ExceptionTryCatch {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        try {
            int aI = sc.nextInt();
            int bI = sc.nextInt();
            System.out.println(aI/bI);
        }catch (InputMismatchException e){
            System.out.println("java.util.InputMismatchException");
        }catch (ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: / by zero");
        }


    }
}

import java.util.Scanner;

/**
 * Created by xh on 2015/10/29.
 */
public class EndOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (sc.hasNext()){
           System.out.println((i++)+" "+sc.nextLine());
        }
    }
}

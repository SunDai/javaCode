import java.util.Scanner;

/**
 * Created by xh on 2015/10/29.
 */
public class StandinAndOut {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x =sc.nextInt();
        double y = sc.nextDouble();
        sc.nextLine();
        String s = sc.nextLine();
        System.out.println("String: "+s);
        System.out.println("Double: "+y);
        System.out.println("Int: "+x);
    }
}

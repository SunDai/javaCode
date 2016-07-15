package algorithm;

/**
 * Created by xh on 2016/1/19.
 */
public class GreatestCommonDivisor {

    public static void main(String[] args){
        int p =27,q = 15;
        System.out.println(gcd(p,q));
    }

    public static int gcd(int p,int q){
        if (q == 0){
            return p;
        }else{
            int r = p%q;
            return gcd(q,r);
        }
    }
}

package algorithm;

/**
 * Created by xh on 2016/1/19.
 * 编写一个程序，三个整数，如果都相等就打印equal，否则打印 not equal
 */
public class c1_1_3 {
    public static void main(String[] args){
        int a=7,b=7,c=97;
        int result1 = a^b;
        int result2 = b^c;
        System.out.println((result1^result2) == 0?"equal":"not equal");
    }
}

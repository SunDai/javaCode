package algorithm;

/**
 * Created by xh on 2016/1/19.
 * ��дһ�����������������������Ⱦʹ�ӡequal�������ӡ not equal
 */
public class c1_1_3 {
    public static void main(String[] args){
        int a=7,b=7,c=97;
        int result1 = a^b;
        int result2 = b^c;
        System.out.println((result1^result2) == 0?"equal":"not equal");
    }
}

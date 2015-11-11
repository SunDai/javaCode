package hackerrank.java;

import java.util.Scanner;

/**
 * Created by xh on 2015/11/2.
 */
public class JavaInterface {
    interface AdvancedArithmetic{
        public abstract int divisorSum(int n);
    }

    static class MyCalculator implements AdvancedArithmetic{
        public int divisorSum(int n){
            int sum = 0;
            int max = (int) Math.sqrt(n);
            for (int i=1;i<=max;i++){
                if (n%i==0){
                    int a = i;
                    int b = n/i;
                    if (a == b){
                        sum+= a;
                    }else {
                        sum+=(a+b);
                    }
                }
            }
            return sum;
        }
    }

    public static void main(String []argh)
    {
        MyCalculator my_calculator=new MyCalculator();
        System.out.print("I implemented: ");
        ImplementedInterfaceNames(my_calculator);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(my_calculator.divisorSum(n)+"\n");
        Object o = new Object();
        if (o instanceof MyCalculator){

        }

    }
    /*
     *  ImplementedInterfaceNames method takes an object and prints the name of the interfaces it implemented
     */
    static void ImplementedInterfaceNames(Object o)
    {

        Class[] theInterfaces = o.getClass().getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++)
        {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}

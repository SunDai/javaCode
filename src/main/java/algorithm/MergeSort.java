package algorithm;

import java.util.Random;

/**
 * Created by xh on 2016/1/23.
 */
public class MergeSort {
    static int[] aux;
    public static void main(String[] args){
        int[] a = generate(13);
        printArray(a);
        aux = new int[a.length];

//        sort(a,0,a.length-1);
        sort(a);
        printArray(a);
    }

    public static void printArray(int[] a){
        String s = "";
        for (int i = 0;i<a.length;i++){
           s = s+" "+a[i];
        }
        s = s.substring(1);
        System.out.println("num is " + s);
    }

    public static int[] generate(int num){
        int[] a = new int[num];
        Random random = new Random();
        for (int i = 0;i<num;i++){
            a[i] = random.nextInt(100);
        }
        return a;
    }

    public static void sort(int[] a,int low,int high){//自顶向下
        if (high<=low) return;
        int mid = low + (high-low)/2;
        System.out.println("sort "+ low+" "+ mid);
        sort(a, low, mid);
        System.out.println("sort " + (mid + 1) + " " + high);
        sort(a, mid + 1, high);
        System.out.println("merge " + low + " " + mid+ " "+high);
        merge(a,low,mid,high);
    }

    public static void sort(int[] a){//自底向上
        int N = a.length;
        for (int i = 1;i<N;i= i+i){
            for (int low = 0;low<N-i;low+=i+i){
                merge(a,low,low+i-1,Math.min(low+i+i-1,N-1));
            }
        }
    }

    public static void merge(int[] a, int low,int mid,int high){
        System.out.println("low is "+low+" mid is "+mid+" high is "+high);
        int i = low,j = mid+1;
        for (int k =0;k<a.length;k++ )//所需空间
            aux[k] = a[k];
        for (int k = low;k<=high;k++){
            if (i>mid) a[k] = aux[j++];
            else if (j>high) a[k] = aux[i++];
            else if (aux[j]<aux[i])a[k] = aux[j++];
            else a[k]=aux[i++];
        }
    }
}

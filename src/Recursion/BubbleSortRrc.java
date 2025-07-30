package Recursion;

import java.util.Arrays;

public class BubbleSortRrc {
    public static void main(String[] args) {
        int [] arr={2,5,1,12,4};
        System.out.println(Arrays.toString(bs(arr)));
    }
    static int[] bs(int[] a){
        return bsi(a,1);

    }
    static int[]bsi(int[] a,int i){
        if(i==a.length-1){
            return a;
        }
        if(a[i]<a[i-1]){
            int temp =a[i-1];
            a[i-1]=a[i];
            a[i]=temp;
        }

        return bsi(a,i+1);
    }
}

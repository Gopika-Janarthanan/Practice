package Sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array={19,9,29,2,12,6};
        System.out.println(Arrays.toString(bubblesort(array)));

    }
    static int[] bubblesort(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }

        }
        return arr;
    }
    static void swap(int[] arr,int f,int s){
        int t=arr[f];
        arr[f]=arr[s];
        arr[s]=t;
    }
}

package Sorting;

import java.util.Arrays;

public class Selectionsort {
    public static void main(String[] args) {
        int[] arr=new int[]{3,2,6,44,12,8};
        System.out.println(min(arr,0,arr.length));
        System.out.println(Arrays.toString(selectionsort(arr)));
    }
    static int[] selectionsort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int min=min(nums,i,nums.length-i);
            if(nums[i] > nums[min]){
                swap(nums,i,min);
            }
        }
        return nums;
    }
    static void swap(int [] arr,int f,int s){
        int t=arr[f];
        arr[f]=arr[s];
        arr[s]=t;
    }
    static int min(int[]arr,int s,int e){
        int max=arr[0];
        for(int i=s;i<e;i++){
           if(arr[i]<max){
               max=i;
           }
        }
        return max;
    }
}

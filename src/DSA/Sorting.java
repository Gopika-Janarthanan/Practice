package DSA;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sorting {
    public static void main(String[] args) {
        int[] array={2,41,96,8,12,23};
        System.out.println(Arrays.toString(selectionsort(array)));
    }
    static int[] bubblesort(int arr[]){
        for (int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }
    static int []selectionsort(int [] arr){
        int maxi;

        for(int i=0;i<arr.length;i++){
            for(int j=1;j< arr.length-i;j++){
                maxi= maxi(arr,0,arr[j]-1-i);
                swap(arr,maxi,arr[j-i-1]);
            }
        }
        return arr;
    }
    static int maxi(int[] arr,int s, int e){
        int max = 0;
        for( int i =s ;s<=e;s++) {
            if (arr[i] < arr[i + 1]) {
                max = i+1;
            }
        }
        return max;
    }
    static void swap(int[] arr, int a,int b){
        int temp=a;
        a=b;
        b=temp;
        }

    }

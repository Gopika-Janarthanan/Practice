package DSA;
import java.util.ArrayList;
import java.util.List;

public class Sorting {
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
    static int []selectionsort(int [] array){
        return array;

    }
}

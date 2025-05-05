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
    static class CyclicSort {
        void missingNumber(int[] arr) {
            int i = 0;
            while (i < arr.length) {
                int c = arr[i];
                if (arr[i] < arr.length && arr[c] != arr[i]) {
                    swap(arr, c, i);
                } else {
                    i++;
                }
            }
            for (int in : arr) {
                System.out.print(in + " ");
            }

        }

        void swap(int[] arr, int f, int l) {
            int temp = arr[f];
            arr[f] = arr[l];
            arr[l] = temp;
        }

    }
    static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans =new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int c= nums[i]-1;
            if (c < nums.length && nums[i] != nums[c])

            {
                swaped(nums,i,c);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }
    static void swaped(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}

package DSA;

import java.util.ArrayList;
import java.util.List;

class CyclicSorting {
    static void missingNumber(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int c = arr[i];
            if (arr[i] < arr.length && arr[c] != arr[i]) {
                swaped(arr, c, i);
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

    static int findDuplicate(int[] nums) {
        int i=0;
        int ans=0;
        while(i<nums.length){
            int c= nums[i]-1;
            if(nums[i]!=nums[c])
            {
                swaped(nums,i,c);
            }
            else{
                i++;
            }
        }
        for(int index=0;index<nums.length;index++){
            if(nums[index]!=index+1){
                ans =nums[index];
            }
        }
        return ans;
    }

}

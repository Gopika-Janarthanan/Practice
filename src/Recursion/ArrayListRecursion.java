package Recursion;

import java.util.*;
public class ArrayListRecursion {
    public static void main(String[] args) {
        int [] array = new int[]{2,3,0,5,0,5,0,0,8,12};
        System.out.println(findtarget(array,0,5,new ArrayList<Integer>()));
        System.out.println(findzero(array,0,new ArrayList<>()));
    }

    static ArrayList<Integer> findtarget(int [] arr,int i,int target ,ArrayList<Integer> ans){
        if(i==arr.length-1){
            return ans;
        }
        if(arr[i]==target){
            ans.add(i);
        }
        return findtarget(arr,i+1,target,ans);


    }
    static ArrayList<Integer> findzero(int[] arr, int index,ArrayList<Integer> ans){

        if( index==arr.length-1){
            return ans;
        }
        if(arr[index]== 0){
            ans.add(index);
        }
        return findzero(arr,index+1,ans);
    }
}

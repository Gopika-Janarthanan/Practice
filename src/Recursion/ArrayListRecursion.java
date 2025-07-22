package Recursion;

import java.util.*;
public class ArrayListRecursion {
    public static void main(String[] args) {
        System.out.println(findtarget(new int[]{2,3,5,5,5,8,12},0,5,new ArrayList<Integer>()));
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
}

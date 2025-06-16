package Recursion;

public class Sorting {
    public static void main(String[] args){
        System.out.println(  sortingrecur(0,new int[]{1,2,9,6}));
    }
    static boolean sortingrecur(int i,int[] arr){
        if(arr.length-1==i){
            return true;
        }
        return arr[i]<arr[i+1] && sortingrecur(i+1,arr);
    }

}

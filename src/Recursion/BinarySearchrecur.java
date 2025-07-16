package Recursion;

public class BinarySearchrecur {
    public static void main(String[] args) {
        int [] arr={2,3,6,7,8,9,10,11,12,34,44,55,90};
        bsr(0,arr.length,12,arr);

    }
    static void bsr(int s,int e, int target,int[] arr){
        int  mid= s+(e-s)/2;
        if(arr[mid]<target){
            s=mid+1;
            bsr(s,e,target,arr);
        }
        if(arr[mid]>target){
            e=mid-1;
            bsr(s,e,target,arr);
        }
        if(arr[mid]==target){
            System.out.println(mid);
        }
    }
}

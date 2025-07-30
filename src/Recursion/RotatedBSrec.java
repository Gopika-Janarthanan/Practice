package Recursion;

public class RotatedBSrec {
    public static void main(String[] args) {
        int[] arr= {5,6,7,8,9,1,2,3};
        RotatedBSrec r=new RotatedBSrec();
        int ans= r.bs(arr,9,0,arr.length-1);
        System.out.println(ans);

    }
    int bs(int arr[], int target,int s,int e){
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[s]<arr[m] && target <arr[m]){
            return bs(arr,target,s,m-1);
        }
        if(arr[m]<arr[s] && target>arr[m]){
            return bs(arr,target,m+1,e);
        }
        return bs(arr,target,s,e);



    }


}

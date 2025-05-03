package DSA;

public class BinarySearching {
    static  int search(int[] arr, int target) {
        int s=0,e=arr.length-1;
        while(s<=e){
            int mid= s+(e-s)/2;
            if(arr[mid] <target){
                s=mid+1;
            }
            else if(arr[mid]>target){
                e=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    static int searchInsert(int[] nums, int target) {
        int s=0, e=nums.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]<target){
                s=mid+1;
            }
            else if(nums[mid]>target){
                e=mid-1;
            }
            else{
                return mid;
            }

        }
        return s;

    }
    static int ceiling(int[] array, int target) {
        int s = 0, e = array.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] > target) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return array[s];
    }

    static int floor(int[] array, int target) {
        int s = 0, e = array.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (array[mid] <= target) {
                s = mid + 1;

            } else if (array[mid] >= target) {
                e = mid - 1;
            } else {
                return mid;
            }
        }
        return array[e];
    }

    static char findchar(char[] array, char target) {
        int s = 0, e = array.length - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (array[mid] <= target) {
                s = mid + 1;

            } else {
                e = mid - 1;
            }
        }
        return array[s % array.length];
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int s = binarysearch(nums, target, true);
        int e = binarysearch(nums, target, false);
        ans[0] = s;
        ans[1] = e;
        return ans;
    }
    static int binarysearch(int[] arr, int tar, boolean start){
        int ans=-1;
        int s=0,e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]<tar){
                s=mid+1;
            }
            else if(arr[mid]>tar){
                e=mid-1;
            }
            else{
                ans=mid;

                if(start){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
        }
        return ans;
    }

    static int infinitearr(int []arr,int tar){
        int s=0,e=2*s+1;
        while(s<=e){
            e=2*s+1;
            int mid=s+(e-s)/2;
            if(arr[mid]<tar){
                s=mid+1;
            }
            else if(arr[mid]>tar){
               e=mid-1;
            }
            else{
                return mid;            }
        }
        return -1;
    }
    static int peakIndexInMountainArray(int[] arr) {
        int s=0,e=arr.length-1;
        while(s<e){
            int mid= s+(e-s)/2;
            if(arr[mid]<arr[mid+1]){
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        return s;
    }

    static int findPeakElement(int[] arr) {
        int s=0,e=arr.length-1;
        while(s<e){
            int mid=s+(e-s)/2;
            if(arr[mid]<arr[mid+1]){
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        return s;
    }
    static int mountainarrayindex(int[]arr,int tar){
        int peek= pivot(arr);
        int assending = bs(arr,tar,0,peek,true);
        if(assending!=-1){
            return assending;
        }
        return bs(arr,tar,peek+1,arr.length-1,false);
    }
    static int pivot(int arr[]){
        int s=0,e=arr.length-1;
        while(s<=e){
            int mid =s+(e-s)/2;
            if(arr[mid]<arr[mid+1]){
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        return s;
    }
    static int bs(int arr[], int target, int st, int ed, boolean assending){
        while(st<ed){
            int mid=st+(ed-st)/2;
            if(arr[mid]==target) return mid;
            if(assending){
                if(arr[mid]< target){
                    st=mid+1;
                }
                else{
                    ed=mid-1;
                }
            }
            else{
                if(arr[mid]>target){
                    ed=mid-1;
                }
                else{
                    st=mid+1;
                }
            }
        }
        return -1;
    }

}

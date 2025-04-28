package DSA;

public class BinarySearching {
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

}

package DSA;

public class LinearSearching {
    static int linearTarget( int[] array, int target){
        int j=0;
        for(int i : array){
            if(i==target){
                j++;
                return j;

            }
        }
        return -1;
    }
    static int[] linear2d(int[][] array,int target){
        for(int i=0;i<array.length;i++){
            for(int j=0;j< array[i].length; j++){
                if(target==array[i][j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int evendigitsofarr(int[]nums){
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            nums[i]= digit(nums[i]);
            if(nums[i]%2==0){
                sum++;
            }
        }
        return sum;
    }
    static int digit(int num){
        int c=0;
        while(num>0){
            num=num/10;
            c++;
        }
        return c;
    }
    static int maximumWealth1(int[][] accounts) {
        int count=0;
        int[] arr =new int[accounts.length];
        for(int i=0 ; i<accounts.length;i++){
            count=0;
            for(int j=0; j<accounts[i].length;j++){
                count+=accounts[i][j];
            }

            arr[i]=count;

        }
        return maximum(arr);
    }
    static int maximum(int[] arr){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        } return max;
    }
    static int maximumWealth2(int[][] accounts) {
        int max=0,count=0;
        for(int[] i: accounts){
            count=0;
            for(int j : i){
                count+=j;
            }
            if(count>max){
                max=count;
            }
        }
        return max;
    }
    static int peakIndexInMountainArray(int[] arr) {
        int max=0;
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max=arr[i];
                index=i;
            }
        }
        return index ;
    }
    static int[] twoSum(int arr[],int target){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(target==arr[i]+arr[j]){
                    return new int[]{i,j};
            }
        }
        }
        return new int[]{-1,-1};
    }
    static int searchrotarearr(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }
    static boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0 ;j<matrix[i].length;j++ ){
                if(matrix[i][j]== target){
                    return true;
                }
            }
        }
        return false;
    }
    static boolean threeConsecutiveOdds(int[] arr) {
        for (int i=2;i<arr.length;i++){
            if(arr[i-2]%2==1 && arr[i-1]%2==1 && arr[i]%2==1){
                return true;
            }

        }
        return false;

    }
}

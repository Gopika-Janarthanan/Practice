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
    public static int maximumWealth2(int[][] accounts) {
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
}

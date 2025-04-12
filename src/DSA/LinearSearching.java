package DSA;

public class LinearSearching {
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
}

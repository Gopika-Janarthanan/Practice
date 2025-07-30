package DSA;

public class String {
            public static void main(String[] args)    {
            int[]nums = {1,2,3,3,2,2};
            System.out.println(longestSubarray(nums));
        }


    static int longestSubarray(int[] nums) {
        int c=0, max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=max){
                max=nums[i];
            }
            for(int e : nums){
                if(e==max){
                    c=c+1;
                }
            }}
        return c;

    }

}

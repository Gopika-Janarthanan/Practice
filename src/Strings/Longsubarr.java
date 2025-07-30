package Strings;

public class Longsubarr {
    public static void main(String[] args) {
        int arr[] ={1,2,3,3,3,3,2,2,3,3};
        System.out.println(longestSubarray(arr));
    }
        public static int longestSubarray(int[] nums) {
            int l=0,c=0, max=nums[0];
            for (int num : nums) {
                if (num > max) {
                    max = num;
                }
            }
            for(int i: nums){
                if(i==max){
                    c++;
                    l=Math.max(c,l);
                }
                else{
                    c=0;
                }
            }
            return l;

        }
    }
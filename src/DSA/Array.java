package DSA;
import java.lang.StringBuffer;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Array {

    boolean isSubsequence(String s, String t) {
        int len= Math.max(s.length(),t.length());
        int i=0,j=0;
        while (i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++; }
            j++;  }
        return i==s.length();
    }

    static int missingNumber(int[] n) {
       int c = 0;
       int s = 0;
       for (int i = 0; i < n.length; i++) {
           c += i + 1;
           s += n[i];
       }
       return c - s;
   }
    String mergeAlternately(String w1, String w2) {
       int len = Math.max(w1.length(), w2.length());
            int i = 0;
            StringBuffer s = new StringBuffer();
            while (i < len) {
                if(i<w1.length()){
                    s.append(w1.charAt(i));
                }
               if(i<w2.length()) {
                   s.append(w2.charAt(i));
               }
                i++;
            }
            return s.toString();
        }
    int maximum(int [] arr){
       int max=0,i=0;
       while(i<arr.length-1){
           if (arr[i]<arr[i+1]){
               max=arr[i+1];
           }
           i++;
       }
       return max ;
        }
    int secondlarge (int[] arr){
       int i=0,sec=0,lar=0;
       while(i<arr.length){
           if (arr[i]>lar){
               sec=lar;
               lar=arr[i];
           }
           if(arr[i]<lar && arr[i]>=sec){
               sec = arr[i];
           }
           i++;

       }
       return sec;
}
    static String reversestrsb (String word){
       StringBuilder s = new StringBuilder(word);
       return s.reverse().toString();
}
    String reverewhile(String word){
       int i=0;
       int len= word.length();
       char[] charar= new char[word.length()];
       while(i<len-1){
           charar[i] =word.charAt(len-1);
           i++;
           len --;
       }
       return new String (charar);
}
    String leftrotate(int[] arr){
    //[1,2,3,4,12]
    int temp=arr[0];
    for (int i =1; i < arr.length; i++) {
        arr[i-1]=arr[i];
    }
    arr[arr.length-1]=temp;

    return Arrays.toString(arr) ;
}
    String leftdarr(int[] array,int d){
        d= d % array.length ;
        int[]first= new int[d-array.length];
        int[] second=new int[d] ;
        int[] arr=new int[first.length+second.length];
        for (int i = 0; i < d ; i++) {
            first[i] = array[i];
        }
        for (int i = d+1; i < array.length; i++) {
            second[i-1]=array[i];
        }


        for (int i = 0; i < first.length; i++) {
            arr[i]=first[i];
        }
        for (int i = first.length; i < array.length; i++) {
            int j=0;
            arr[i]=second[j];
            j++;

        }
       return Arrays.toString(arr);
    }
    static int[] rotate(int[] nums , int k) {
        int len=nums.length-k;
        int [] ans =new int[nums.length];
        int s=0;
        int c=k;
        k = k % nums.length;
        if (k == 0 || nums.length <= 1) return nums;
        for(int i =0;i<nums.length-k;i++){

            if(c<nums.length){
                ans[c]=nums[i];
                c++;
            }
        }
        for(int i =nums.length-k+1;i<nums.length;i++){
            if(s<k){
                ans[s]=nums[i];
                s++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = ans[i];
        }
        return nums;

    }
    static  int removeDuplicates1(int[] nums) {
        Set<Integer> ans = new TreeSet<>();
        int c=0;
        for(int i: nums){
            ans.add(i);
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                c++;
            }
        }
        int s=0;
        for(int in : ans){
            nums[s++]=in;

        }
        return ans.size();
    }

    static int removeElement(int[] nums, int val) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[c++]=nums[i];
            }
        }
        return c;
    }

    static  int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (j==1  || nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
    static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    static String triangleType(int[] nums) {
        int i=2;
        if(nums[i-2] + nums[i-1] <= nums[i] ||
                nums[i-2] + nums[i] <= nums[i-1] ||
                nums[i-1] + nums[i] <= nums[i-2]) {
            return "none";
        }
        else if(nums[i-2]==nums[i-1] && nums[i-1]==nums[i]){
            return "equilateral";
        }
        else if(nums[i-2] == nums[i-1]|| nums[i-1]==nums[i] || nums[i-2]==nums[i]){
            return "isosceles";
        }
        return "scalene";
    }

}
package DSA;

import java.util.Arrays;

public class ArrayMain {
    public static void main(String[] args) {
        Array arr = new Array();
        int[] arrays ={1,2,34,3,3,5,56};
        System.out.println("Array :");
        System.out.println(arr.missingNumber(arrays));
        System.out.println(arr.mergeAlternately("123","456"));
        System.out.println(arr.secondlarge(new int[]{05,1,20,1}));
        System.out.println(Array.reversestrsb("GOPIKA Janarthanan"));
        System.out.println(arr.reverewhile("hello"));
        System.out.println(arr.leftrotate(new int[]{1,12,3,4,120,32}));
        System.out.println(Arrays.toString(Array.rotate(arrays,3)));
        System.out.println(Array.removeDuplicates(arrays));
    }
}

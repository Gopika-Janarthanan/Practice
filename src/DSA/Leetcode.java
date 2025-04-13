package DSA;

import javax.sound.sampled.Line;
import java.util.Arrays;

public class Leetcode {
    public static void main(String[] args) {
        int[] arrays={13,12,40,6,50};
        int[][] array ={{3,7,4,2},
                {5,6,12,12},
                {4,2,1,7,9},
                {1,2,4,4,}};
        int[] binarrar= new int[]{2,4,5,12,12,12,12,12,24,38,44,55,120,122};

      Array arr = new Array();
      LinearSearching ls=new LinearSearching();
      System.out.println("Array :");
      System.out.println(arr.missingNumber(arrays));
      System.out.println(arr.mergeAlternately("123","456"));
      System.out.println(arr.secondlarge(new int[]{05,1,20,1}));
      System.out.println(Array.reversestrsb("GOPIKA Janarthanan"));
      System.out.println(arr.reverewhile("hello"));
      System.out.println(arr.leftrotate(new int[]{1,12,3,4,120,32}));
      System.out.println();
      System.out.println("Linear Searching : ");
      System.out.println(LinearSearching.evendigitsofarr(arrays));
      System.out.println(LinearSearching.maximumWealth1(array));
      System.out.println(LinearSearching.maximumWealth2(array));
      System.out.println(LinearSearching.linearTarget(arrays,12));
      System.out.println(Arrays.toString(LinearSearching.linear2d(array,12)));
      System.out.println();
      System.out.println("Binary Searching  : ");
      System.out.println(BinarySearching.ceiling(binarrar,15));
      System.out.println(BinarySearching.floor(binarrar,15));
      System.out.println(BinarySearching.findchar(new char[]{'c','f','j','h','i'},'c'));
      System.out.println(Arrays.toString(BinarySearching.searchRange(binarrar,12)));

    }
}


package DSA;

import javax.sound.sampled.Line;
import java.util.Arrays;
import java.util.Scanner;

public class Leetcode {
      public static void main(String[] args) {
      int[] arrays={13,12,400,6,6,50};
      int[][] array ={{3,7,4,2},
                {5,6,12,12},
                {4,2,1,7,9},
                {1,2,4,4,}};
      int[] binarrar= new int[]{2,4,5,12,24,38,44,55,120,122,144,266,351,399,400,412,424,444,500};
      int[] peakarr = new int[]{1,2,3,5,3,2,0};
      int arrs[]={88888,12,5,34,85,2,76,23};
      int [] continuousn ={9,6,4,2,3,5,7,0,1};

      Array arr = new Array();
      LinearSearching ls=new LinearSearching();
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a Number : ");
      int number = input.nextInt();
      System.out.println("Even or odd :-");
      System.out.println(BasicMath.evenorodd(number));
      System.out.println("Find Last digit of a number:-");
      System.out.println(BasicMath.findLastDigit(number));
      System.out.println("Count of digit :-");
      System.out.println(BasicMath.digitsCount(number));
      System.out.println("Reversee anumber :-");
      System.out.println(BasicMath.rev(number));
      System.out.println();
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
      System.out.println(LinearSearching.peakIndexInMountainArray(arrays));
      System.out.println(Arrays.toString(LinearSearching.twoSum(arrays,12)));
      System.out.println(LinearSearching.searchrotarearr(arrays,34));
      System.out.println();
      System.out.println("Binary Searching  : ");
      System.out.println(BinarySearching.search(binarrar,15));
      System.out.println(BinarySearching.searchInsert(binarrar,15));
      System.out.println(BinarySearching.ceiling(binarrar,15));
      System.out.println(BinarySearching.floor(binarrar,15));
      System.out.println(BinarySearching.findchar(new char[]{'c','f','j','h','i'},'c'));
      System.out.println(Arrays.toString(BinarySearching.searchRange(binarrar,12)));
      System.out.println(BinarySearching.infinitearr(binarrar,120));
      System.out.println(BinarySearching.peakIndexInMountainArray(peakarr));
      System.out.println(BinarySearching.findPeakElement(binarrar));
      System.out.println();
      System.out.println("Sorting : ");
      System.out.println(Arrays.toString(Sorting.bubblesort(arrs)));

    }
}


package DSA;

import java.util.Arrays;

public class BinarysearchMain {
    public static void main(String[] args) {
        int[] arrays={13,12,400,6,6,50};
        int[][] array ={{3,7,4,2},
                {5,6,12,12},
                {4,2,1,7,9},
                {1,2,4,4,}};
        int[] binarrar= new int[]{2,4,5,12,12,12,12,12,24,38,44,55,120,122,144,266,351,399,400,412,424,444,500};
        int[] peakarr = new int[]{1,2,3,5,3,2,0};
        int[] sortedrotate ={4,6,9,0,1,2,3};
        System.out.println("Binary Searching  : ");
        System.out.println(BinarySearching.ceiling(binarrar,15));
        System.out.println(BinarySearching.floor(binarrar,15));
        System.out.println(BinarySearching.findchar(new char[]{'c','f','j','h','i'},'c'));
        System.out.println(Arrays.toString(BinarySearching.searchRange(binarrar,12)));
        System.out.println(BinarySearching.infinitearr(binarrar,120));
        System.out.println(BinarySearching.peakIndexInMountainArray(peakarr));
        System.out.println(BinarySearching.findPeakElement(binarrar));
        System.out.println(BinarySearching.mountainarrayindex(peakarr,3));
        System.out.println(BinarySearching.mountainarrayindex(sortedrotate,9));
    }
}

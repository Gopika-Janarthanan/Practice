package DSA;

import java.util.Arrays;

public class LinearSearchMain {
    public static void main(String[] args) {
        int[] arrays={13,12,400,6,6,50};
        int[][] array ={{3,7,4,2},
                {5,6,12,12},
                {4,2,1,7,9},
                {1,2,4,4,}};
        int[] binarrar= new int[]{2,4,5,12,12,12,12,12,24,38,44,55,120,122,144,266,351,399,400,412,424,444,500};
        int[] peakarr = new int[]{1,2,3,5,3,2,0};
        System.out.println("Linear Searching : ");
        System.out.println(LinearSearching.evendigitsofarr(arrays));
        System.out.println(LinearSearching.maximumWealth1(array));
        System.out.println(LinearSearching.maximumWealth2(array));
        System.out.println(LinearSearching.linearTarget(arrays,12));
        System.out.println(Arrays.toString(LinearSearching.linear2d(array,12)));
        System.out.println(LinearSearching.peakIndexInMountainArray(arrays));
        System.out.println(Arrays.toString(LinearSearching.twoSum(arrays,12)));

    }
}

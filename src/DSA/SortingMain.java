package DSA;

import java.util.Arrays;

public class SortingMain {
    public static void main(String[] args) {
        int arr[]={88888,12,5,34,85,2,76,23};
        int [] continuousn ={9,6,4,2,3,5,7,0,1};
        int [] continuousnum ={9,6,4,2,3,4,2,3,5,7,0,1};
      //  System.out.println(Arrays.toString(Sorting.bubblesort(arr)));
        Sorting sort = new Sorting();
      //  Sorting.CyclicSort csort = new Sorting.CyclicSort();
      //  csort.missingNumber(continuousn);
        Sorting.findDisappearedNumbers(continuousnum);

    }
}

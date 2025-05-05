package DSA;

public class CyclicSortingMain {
    public static void main(String[] args) {
        int arr[]={88888,12,5,34,85,2,76,23};
        int [] continuousn ={9,6,4,2,3,5,7,0,1};
        int [] continuousnum ={9,6,4,2,3,4,2,3,5,7,0,1};
        CyclicSorting.findDuplicate(continuousnum);
        CyclicSorting.missingNumber(continuousnum);
        CyclicSorting.findDisappearedNumbers(continuousnum);
        CyclicSorting.findDuplicate(continuousnum);
        CyclicSorting.findDuplicates(continuousnum);
        CyclicSorting.findErrorNums(continuousn);

    }

}

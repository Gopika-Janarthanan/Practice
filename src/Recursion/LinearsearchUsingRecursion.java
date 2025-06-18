package Recursion;

public class LinearsearchUsingRecursion {
    public static void main(String[] args) {
        System.out.println(lirecur(new int[]{2,3,102,6,12,24,35,678},12,0));
    }

    static boolean lirecur(int[] arr, int targert, int i) {
        if (arr.length - 1 == i) {
            return false;
        } else if ((arr[i] == targert) || lirecur(arr, targert, i + 1)) {
            return true;
        }
        return false;
    }
}

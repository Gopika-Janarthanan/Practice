package Recursion;

public class Palindromenum {
    public static void main(String[] args) {
        System.out.println(palindrome(1234321));
        System.out.println(palindrome(2349));
    }
    static boolean palindrome (int n){
        System.out.println(n);
        System.out.println(reverse(n,0));
        return n== reverse( n , 0);
    }
    static int reverse(int n , int sum){
        if(n==0){
            return sum;
        }

        return reverse(n/10,sum*10+n%10);
    }
}

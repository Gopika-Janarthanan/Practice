package Recursion;

public class revusingrecursion {
    public static void main(String[] args) {
        System.out.println(rev(12345,0));

    }

    static int rev(int n,int sum){

        if(n==0){
            return sum;
        }
        int rem=n%10;
        return rev(n/10,sum*10+rem);
    }
}

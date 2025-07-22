package Recursion;

public class revusingrecursion {
    public static void main(String[] args) {
        System.out.println(rev(123405));

    }
    static int rev(int n){
        return helprev(n,0);
    }
    static int helprev(int n,int sum){

        if(n==0) {
            return sum;
        }
        return helprev(n/10,sum*10+n%10);
    }
}

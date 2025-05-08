package Recursion;

public class Naturalnumbers {
    public static void main(String[] args) {
        Naturalnumbers.naturalnumber(12);
    }
    static int naturalnumber(int n){
        if(n==0){
            return n;
        }
        System.out.print(n + " ");
        return naturalnumber(n-1);
    }
}

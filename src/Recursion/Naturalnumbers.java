package Recursion;

public class Naturalnumbers {
    public static void main(String[] args) {
        System.out.println(" Recursion");
        Naturalnumbers.naturalnum(12);
        System.out.println(revnaturalnumber(12));
        System.out.println(numberOfSteps(12));
        System.out.println(natural(12));
    }
    static int revnaturalnumber(int n){
        if(n==0){
            return n;
        }
        System.out.print(n + " ");
        return revnaturalnumber(n-1);
    }
    static int natural(int n){
        if(n==0) {
            return n;
        }
        System.out.print(n+" ");
        return natural(n-1);
    }
    static  void naturalnum(int n){
        if(n==0){
            return ;
        }
        naturalnum(n-1);
        System.out.print(n +" ");

    }
    static int numberOfSteps(int num) {
        return nums(num, 0);
    }
    static int nums(int num, int steps) {
        if (num == 0) {
            return steps;
        }
        if (num % 2 == 0) {
            return nums(num / 2, steps + 1);
        } else {
            return nums(num - 1, steps + 1);
        }
    }
}

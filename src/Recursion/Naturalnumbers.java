package Recursion;

public class Naturalnumbers {
    public static void main(String[] args) {
        Naturalnumbers.naturalnum(12);
        System.out.println(revnaturalnumber(12));
    }
    static int revnaturalnumber(int n){
        if(n==0){
            return n;
        }
        System.out.print(n + " ");
        return revnaturalnumber(n-1);
    }
    static  void naturalnum(int n){
        if(n==0){
            return ;
        }
        naturalnum(n-1);
        System.out.print(n +" ");

    }
}

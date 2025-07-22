package Recursion;

public class Countnoofzeros {
    public static void main(String[] args) {
        System.out.println(count(100970304));
    }
    static int count(int n){
        return sum(n,0);
    }
    static int sum(int n,int c){
        if(n==0 ){
            return c;
                    }
        if(n%10==0){
            c=c+1;
        }
        return sum(n/10,c);
    }
}

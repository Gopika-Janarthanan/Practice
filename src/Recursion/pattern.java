package Recursion;

public class pattern {
    public static void main(String[] args){
        System.out.println(right(4));

    }
    static String right(int n){
        if(n==0){
           return " ";
        }
        for(int i=0;i<n;i++ ){
            System.out.print("* ");
        }
        System.out.println();
      return right(n-1);
    }
}

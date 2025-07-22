package Recursion;

public class SumofDigit {
    public static void main(String[] args) {
        System.out.println(sumdigit(4516));
    }
    static int sumdigit(int n){
        int s=n%10;
        if(n==0){
            return 0;
        }


        return s +sumdigit(n/10);
    }
}

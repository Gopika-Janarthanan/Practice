package DSA;

public class Patterns {
    public static void main(String[] args) {
        rectangle(5);
    }
    static void rectangle(int n){
        for (int row = 0; row < n; row++) {
            for (int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

package DSA;

public class Patterns {
    public static void main(String[] args) {
        rectangle(5);
        righttriangle(3);
    }
    static void rectangle(int n){
        for (int row = 0; row < n; row++) {
            for (int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void righttriangle(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row+1; col++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

}

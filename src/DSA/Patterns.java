package DSA;

public class Patterns {
    public static void main(String[] args) {
       /*rectangle(5);
       righttriangle(3);
       lefttriangle(3);
       leftno(5);
       righttno(5);
       halfdiamond(5);*/
       halfdiamonddnum(4);
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
    static void lefttriangle(int n){
        for (int row=0;row<n;row++){
            for(int col=0;col<n-row;col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void leftno(int n){
        for(int row=0;row<n;row++){
            for(int col=0;col<row;col++){
                System.out.print(row);
            }
            System.out.println();
        }
    }
    static void righttno(int n){
        for(int row=0;row<n;row++){
            for(int col=0;col<row;col++){
                System.out.print(col+1);
            }
            System.out.println();
        }
    }
    static void halfdiamond(int n){
        for(int row=0;row<n;row++){
            for(int col=0;col<row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int r = 0; r < n; r++) {
            for (int c=0;c<n-r;c++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void halfdiamonddnum(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(col+1);
            }
            System.out.println();
        }
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n-r; c++) {
                System.out.print(c+1);
            }
            System.out.println();

        }
    }


}

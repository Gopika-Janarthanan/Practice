package Recursion;

public class BasicRecursion {
    public static void main(String[] args){
        BasicRecursion br =new BasicRecursion();
        System.out.println(br.method(9) );
    }
    int method(int n ){
        System.out.println("m");
        method1();
        return n;
    }
    void method1(){
        System.out.println("m1");
        method2();
    }
    void method2(){
        System.out.println("m2");
    }

}

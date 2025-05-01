package DSA;

import java.util.Scanner;

public class BasicMath {
    //1.Find even or odd
    static boolean evenorodd(int n){
        if(n%2==0){
            return true;
        }
        return false;
    }
    //2.Find last digit in a number
    static int findLastDigit(int number){
        return number%10;
    }
    //3.Count digits in a number
    static  int digitsCount(int num){
        int c=0;
        while(c<num){
            num=num/10;
            c++;
        }
        return c;
    }
    //4.Reverse a number
    static int rev(int num){
        int r=0;
        while(0< num){
            int d= num%10;
            r=r*10+d;
            num=num/10;
        }
        return r;
    }
    //5.Find power of a number
    static int pow(int n){
        return n*n;
    }
}

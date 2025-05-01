package DSA;

import java.util.Scanner;

public class BasicMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int number = input.nextInt();
        System.out.println("Even or odd :-");
        System.out.println(BasicMath.evenorodd(number));
        System.out.println("Find Last digit of a number:-");
        System.out.println(BasicMath.findLastDigit(number));
        System.out.println("Count of digit :-");
        System.out.println(BasicMath.digitsCount(number));
        System.out.println("Reversee anumber :-");
        System.out.println(BasicMath.rev(number));
        System.out.println(BasicMath.pow(12));

    }
}

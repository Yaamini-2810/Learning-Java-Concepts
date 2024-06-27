//Write a program which generates 30 terms of fibonacci number in an array and then prints it.

import java.util.Scanner;

public class Array_Exercise13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size ");
        int arrSize = sc.nextInt();
        long[] fibonacci = new long[arrSize];
        System.out.println("Enter first element of fibonacci series: " );
        fibonacci[0] = sc.nextInt();
        System.out.println("Enter first element of fibonacci series: " );
        fibonacci[1] = sc.nextInt();
        for(int i=2 ; i<fibonacci.length ; i++) {
            fibonacci[i] = fibonacci[i-1]+fibonacci[i-2];
        }
        System.out.println("Fibonacci series ");
        for(int i=0 ; i<fibonacci.length ; i++) {
            System.out.println(fibonacci[i]+ " ");
        }


    }
}
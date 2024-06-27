//Write a program to take in 10 values and print only those numbers which are prime
import java.util.Scanner;

public class Array_Exercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Prime Numbers:");
        for( int i=0 ; i<arr.length ; i++) {
            int p = 1;
            int j = 2;
            while(j<arr[i]) {
                if(arr[i]%j ==0) {
                    p = 0;
                    break;
                }j++;
            }
            if(p == 1) {
                System.out.println(" " +arr[i]);
            }

        }
    }
}



//print the sum of integers in an array
import java.util.Scanner;

public class Array_Exercise1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:" );
        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=0 ; i<arr.length ; i++) {
            sum += arr[i];
        }
        System.out.println("The Sum of the array elements is" + sum);
        System.out.println("The Average of the array elements" + (sum/n));
    }
}

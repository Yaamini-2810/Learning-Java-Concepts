//Find the largest Number from an array and print it along with its index
import java.util.Scanner;

public class Array_Exercise3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements:");
        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }
        int largestNumber = arr[0];
        int largestNumberIndex = 0;
        for(int i=0 ; i<arr.length; i++) {
            if(largestNumber<arr[i]) {
                largestNumber = arr[i];
                largestNumberIndex = i;
            }

        }
        System.out.println("Largest Number:" + largestNumber);
        System.out.println("Largest NUmber Index:" + largestNumberIndex);


    }
}

//Copy of an array by iterating array
import java.util.Arrays;
import java.util.Scanner;

public class Array_Exercise14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i=0 ; i<n ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Source Array: " + Arrays.toString(arr));
        int[] newArray = new int[n];
        for(int i=0 ; i<n ; i++) {
            newArray[i] = arr[i];
        }
        System.out.println("New Array: " + Arrays.toString(newArray));
    }
}


import java.util.Arrays;
import java.util.Scanner;

public class Array_Exercise15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for(int i=0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Enter the index of removing element: ");
        int removeIndex = sc.nextInt();
        for(int i=removeIndex ; i<arr.length-1 ; i++) {
            arr[i] = arr[i+1];
        }
        System.out.println("After removing the element: " + Arrays.toString(arr));
    }


}

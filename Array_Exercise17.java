import java.util.Arrays;
import java.util.Scanner;
import java.util.Arrays;
public class Array_Exercise17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        System.out.println("Enter the array elements: ");
        for(int i=0 ; i<arrSize ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(arr));
        for(int i=0 ; i<arr.length/2 ; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        System.out.println("Reverse array: " + Arrays.toString(arr));
    }
}

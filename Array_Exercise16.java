import java.util.Arrays;
import java.util.Scanner;

public class Array_Exercise16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        for(int i=0 ; i<arrSize ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the position to insert an element: ");
        int insertElement = sc.nextInt();
        System.out.println("Enter the new element: ");
        int newElement = sc.nextInt();
        System.out.println("original Array: " + Arrays.toString(arr));

        for(int i=arr.length-1 ; i >insertElement ; i--) {
            arr[i] = arr[i-1];
        }
        arr[insertElement] = newElement;

        System.out.println("new Array: " + Arrays.toString(arr));



    }
}

//Merge of two arrays and print the output in console
import java.util.Arrays;
import java.util.Scanner;

public class Array_Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array1:");
        int arr1Size = sc.nextInt();
        int[] arr1 = new int[arr1Size];
        System.out.print("Enter the array1 elements:");
        for(int i=0 ; i<arr1Size ; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the size of array2:");
        int arr2Size = sc.nextInt();
        int[] arr2 = new int[arr2Size];
        System.out.print("Enter the array2 elements:");
        for(int i=0 ; i<arr2Size ; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Merging of two arrays");
        int[] arr3 = new int[arr1Size+arr2Size];
        for(int i=0 ; i<arr1.length ; i++) {
            arr3[i] = arr1[i];
        }
        for(int i=0 ; i<arr2.length ; i++){
            arr3[i+arr1.length] = arr2[i];
        }
        System.out.println("The Output array after merging");
        System.out.println(Arrays.toString(arr3));


    }
}

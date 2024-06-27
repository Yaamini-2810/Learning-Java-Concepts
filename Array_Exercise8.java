//Write a program that creates integer array of 10 elements, accepts values of arrays and search for a number in an array of 10
import java.util.Scanner;

public class Array_Exercise8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 0, x;
        System.out.println("Enter the 10 Elements of array:");
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the search element in an array:");
        x = sc.nextInt();
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == x) {
                flag = 1;
                break;
            } else {
                flag = 0;
            }
            if (flag == 1) {
                System.out.println("Element found at position: " + (j + 1));
            } else {
                System.out.println("Element is not found");
            }
        }
    }
}



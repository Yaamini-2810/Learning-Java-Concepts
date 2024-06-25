import java.util.Scanner;

public class Array_Exercise6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements");
        for(int i=0 ;  i<n ; i++) {
            arr[i] = sc.nextInt();
        }
        int sumOfOddNos = 0;
        for(int j=0 ; j<arr.length ; j++) {
            if(arr[j]%2 != 0) {
                sumOfOddNos += arr[j];
            }
        }
        System.out.println("The sum of odd numbers is " + sumOfOddNos);

    }
}

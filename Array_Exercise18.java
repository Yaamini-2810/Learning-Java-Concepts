import java.util.Scanner;

public class Array_Exercise18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int arrSize = sc.nextInt();
        int[] arr = new int[arrSize];
        System.out.println("Enter the array elements: ");
        for(int i=0 ; i<arrSize ; i++) {
            arr[i] = sc.nextInt();
        }
        for(int i=0 ; i<arr.length-1 ; i++) {
            for(int j=i+1 ; j<arr.length ; j++) {
                if((arr[i] == arr[j])&&(i!=j)){
                    System.out.println("Duplicate elements: " + arr[j]);
                }
            }
        }
    }
}

package MultiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MD_Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows: ");
        int rowSize = sc.nextInt();
        int[][] arr = new int[rowSize][];
        for(int i=0 ; i<rowSize ; i++) {
            System.out.println("Enter the no.of columns in a row number" + i);
            int colSize = sc.nextInt();
             arr[i] = new int[colSize];
             System.out.println("Input:");
             System.out.println("Please enter the column values for row number" +i);
             for(int j=0 ; j<colSize ; j++) {
                 arr[i][j] = sc.nextInt();
             }
        }
        for(int i=0 ; i<arr.length ; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
        int sum = 0;
        for(int i=0 ; i<arr.length ; i++) {
            for(int j=0 ; j<arr.length ; j++) {
                sum += arr[i][j];
            }
        }
        System.out.println("Output:" +sum);
    }
}

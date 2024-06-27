package MultiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class MD_Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of rows: ");
        int rowSize1 = sc.nextInt();
        int[][] arr1 = new int[rowSize1][];
        for(int i=0 ; i<rowSize1 ; i++) {
            System.out.println("Enter the no.of columns in row number" +i);
            int colSize1 = sc.nextInt();
            arr1[i] = new int[colSize1];
            System.out.println("Input1: ");
            System.out.println("Enter the column values for the row number" +i);
            for(int j=0 ; j<colSize1 ; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the no.of rows: ");
        int rowSize2 = sc.nextInt();
        int[][] arr2 = new int[rowSize2][];
        for(int i=0 ; i<rowSize2 ; i++) {
            System.out.println("Enter no.of columns in row number" +i);
            int colSize2 = sc.nextInt();
            arr2[i] = new int[colSize2];
            System.out.println("Input2:");
            System.out.println("Enter the column values in row number" +i);
            for(int j=0 ; j<colSize2 ; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        for(int i=0 ; i<arr1.length ; i++) {
            System.out.println( Arrays.toString(arr1[i]));
        }
        for(int i=0 ; i<arr2.length ; i++) {
            System.out.println( Arrays.toString(arr2[i]));
        }
        int[][] arr3 = new int[arr1.length][];
        for(int i=0 ; i<arr1.length ; i++) {
            arr3[i] = new int[arr1[i].length];
            for(int j=0 ; j<arr1[i].length ; j++) {
                arr3[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("output:");
        for(int i=0 ; i<arr3.length ; i++){
            System.out.println(Arrays.toString(arr3[i]));
        }
    }

}

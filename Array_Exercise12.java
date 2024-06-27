//Write a program to initialize a single dimensional array of 8 integers. print array element the indexes of
//each element and square of each in three columns.
import java.util.Scanner;

public class Array_Exercise12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[8];
        for(int i=0 ; i<8 ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Index \t Element \t Squares");
        for(int i=0 ; i<8 ; i++) {
            System.out.println(i +"\t\t\t"+ arr[i] +"\t\t\t"+ arr[i]*arr[i]);
        }
    }
}



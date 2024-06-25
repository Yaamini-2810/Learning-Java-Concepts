//Find the Minimum Length word from an array and print it along with its index
import java.util.Scanner;
import java.lang.String;

public class Array_Exercise5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size:");
        int arrSize = sc.nextInt();
        String[] arr = new String[arrSize];
        System.out.println("Enter array elements:");
        for(int i=0 ; i<arrSize ; i++) {
            arr[i] = sc.next();
        }
        String minLengthWord = arr[0];
        int minLengthWordIndex = 0;
        for(int i=0 ; i<arr.length ; i++) {
            if(minLengthWord.length()>arr[i].length()) {
                minLengthWord = arr[i];
                minLengthWordIndex = i;
            }
        }
        System.out.println("Minimum Length Word is " +  minLengthWord);
        System.out.println("Minimum Length Word Index is " + minLengthWordIndex);
    }
}

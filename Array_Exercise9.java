//Write an array which takes in roll no and marks in 3 subjects for 10 students. Print the rollno,
//total marks and average for all students
import java.util.Scanner;

public class Array_Exercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of students: ");
        int s = sc.nextInt();
        int[] rollNo = new int[s];
        System.out.println("Enter the Roll Nos of students: ");
        for( int i=0 ; i<s ; i++){
            rollNo[i] = sc.nextInt();
        }
        int[] subject1 = new int[s];
        System.out.println("Enter the subject1 marks of students: ");
        for( int i=0 ; i<s ; i++){
            subject1[i] = sc.nextInt();
        }
        int[] subject2 = new int[s];
        System.out.println("Enter the subject2 marks of students: ");
        for( int i=0 ; i<s ; i++){
            subject2[i] = sc.nextInt();
        }
        int[] subject3 = new int[s];
        System.out.println("Enter the subject3 marks of students: ");
        for( int i=0 ; i<s ; i++){
            subject3[i] = sc.nextInt();
        }
        double[] total = new double[s];
        double[] average = new double[s];
        for(int i=0 ; i<s ; i++) {
            total[i] = (subject1[i]+subject2[i]+subject3[i]);
            average[i] = (total[i]/3.0);
        }
        System.out.println("Roll No \t Total \t Average");
        for(int i=0 ; i<s ; i++){
            System.out.println(rollNo[i] +"\t"+ total[i] +"\t"+ average[i] );
        }


    }
}









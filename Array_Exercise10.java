//Write an array which takes in roll no and marks in 3 subjects for 10 students. Print the rollno,
//total marks and average for all students.
import java.util.Scanner;

public class Array_Exercise10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of students :");
        int s = sc.nextInt();
        int[] rollNo = new int[s];
        int[] subject1 = new int[s];
        int[] subject2 = new int[s];
        int[] subject3 = new int[s];
        double[] total = new double[s];
        double[] average = new double[s];
        for(int i=0 ; i<s ; i++) {
            System.out.println("Enter student" +(i+1)+ "details");
            System.out.println("RollNo:");
            rollNo[i] = sc.nextInt();
            System.out.println("Subject1:");
            subject1[i] = sc.nextInt();
            System.out.println("Subject2:");
            subject2[i] = sc.nextInt();
            System.out.println("Subject3:");
            subject3[i] = sc.nextInt();
            total[i] = (subject1[i]+subject2[i]+subject3[i]);
            average[i] = (total[i]/3.0);

        }
        System.out.println("RollNo \t Total \t Average");
        for(int i=0 ; i<s ; i++) {
            System.out.println(rollNo[i] +"\t"+ total[i] +"\t"+ average[i]);
        }
    }
}



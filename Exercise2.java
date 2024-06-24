import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input 'a' Value");
        int a = sc.nextInt();
        System.out.println("Input 'b' Value");
        int b = sc.nextInt();
        System.out.println("Input 'c' Value");
        int c = sc.nextInt();
        if((a>b)&&(a>c)){
            System.out.println("'a' is bigger number");
        }else if((b>a)&&(b>c)) {
            System.out.println("'b' is bigger number");
        }else{
            System.out.println("'c' is bigger number");
        }
    }
}

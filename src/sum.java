import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.println("enter first number :");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("enter second number: ");
        int a = input.nextInt();
        int x = n;
        int y = a;
        System.out.println("sum = " + (x+y));
    }
}

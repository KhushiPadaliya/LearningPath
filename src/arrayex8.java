import java.util.Arrays;
import java.util.Scanner;

public class arrayex8 {
    public static void main(String[] args) {
        System.out.println("how many elements you want to enter : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] numbers = new int[n];
        for(int i=0; i<numbers.length; i++) {
            System.out.println("enter number: ");
            numbers[i] = input.nextInt();
        }
        System.out.println("which number you want to display: ");
        int a = input.nextInt();
        for(int i=0; i<numbers.length; i++) {
            if (numbers[i] == a) {
                numbers[i] = 0;
            }
        }
        System.out.println(Arrays.toString(numbers));



    }
}

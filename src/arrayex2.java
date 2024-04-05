import java.util.Arrays;
import java.util.Scanner;

public class arrayex2 {
    public static void main(String[] args) {
        System.out.println("how many numbers you want to enter : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[]numbers = new int[n];
        int sum=0;
        int product=1;
        for(int i=0; i<numbers.length; i++){
            System.out.println("enter number: ");
           numbers[i]= input.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        for(int i=0; i< numbers.length; i++){
            sum=sum+numbers[i];
            product = product*numbers[i];
        }
        System.out.println("sum of array is " + sum);
        System.out.println("product of array is " + product);
        System.out.println("average of array is " + sum/n);
    }

}

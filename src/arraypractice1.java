import java.util.Arrays;
import java.util.Scanner;

public class arraypractice1 {
    public static void main(String[] args) {
        System.out.println("how many nubers you want to enter : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[]numbers = new int[n];
        for(int i=0; i<numbers.length; i++){
            System.out.println("enter numbers: ");
            numbers[i]= input.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("maximum number = "+ numbers[numbers.length-1]);
        System.out.println("minimum number = "+ numbers[0]);

    }
}

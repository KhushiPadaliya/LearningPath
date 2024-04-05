import java.util.Scanner;

public class arraysum {
    public static void main(String[] args) {
        int[]numbers = new int[5];
        Scanner input = new Scanner(System.in);
       // int n = input.nextInt();
        int sum=0;
        for(int i =0; i<numbers.length; i++){
            System.out.println("enter number: ");
            numbers[i]=input.nextInt();
            sum=sum+numbers[i];
        }
        System.out.println("sum = "+ sum);
    }
}

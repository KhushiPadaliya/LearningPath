import java.util.Arrays;
import java.util.Scanner;

public class arrayex6 {
    public static void main(String[] args) {
        System.out.println("how many elements you want to enter : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] numbers = new int[n];
        for(int i=0; i<numbers.length; i++){
            System.out.println("enter number: ");
            numbers[i]= input.nextInt();
        }
        int max=numbers[0];
        int min=numbers[0];
        System.out.println(Arrays.toString(numbers));
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
          if(numbers[i]<min){
              min=numbers[i];
          }
        }
        System.out.println("max=" + max + " min=" + min );

    }
}

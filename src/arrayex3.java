import java.util.Arrays;
import java.util.Scanner;

public class arrayex3 {
    public static void main(String[] args) {
        System.out.println("how many numbers you want to enter : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[]numbers = new int[n];
        for(int i=0; i<numbers.length; i++){
            System.out.println("enter your number : ");
            numbers[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(numbers));
while(numbers.length!=0) {
    System.out.println("which number you want to display:  or  press -1 to exit !!");

    n = input.nextInt();
    if(n==-1){
        break;
    }

    int c = 0;
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] == n) {
            c++;
        }
    }
    System.out.println(c + " times number repeat in array : ");
}


    }
}








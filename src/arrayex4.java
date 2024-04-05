import java.util.Arrays;
import java.util.Scanner;

public class arrayex4 {
    public static void main(String[] args) {
        System.out.println("how many numbers you want to display : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] numbers = new int[n];
        for(int i=0; i<numbers.length; i++){
            System.out.println("enter number: ");
          //  int a = input.nextInt();
            numbers[i]= input.nextInt();
            if(i%2!=0){
                numbers[i]=0;
            }
         //   else{
           //     numbers[i]=a;
            //}
        }
        System.out.println(Arrays.toString(numbers));

//        for(int i=0; i<numbers.length; i++){
//            if(i%2!=0){
//               numbers[i]=0;
//            }
//        }
        //System.out.println(Arrays.toString(numbers));


    }
}

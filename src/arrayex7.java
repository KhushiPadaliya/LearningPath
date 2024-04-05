import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arrayex7 {
    public static void main(String[] args) {
        System.out.println("how many element you want to enter: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[]numbers = new int[n];
        for(int i=0; i<numbers.length; i++){
            System.out.println("enter number: ");
            numbers[i]= input.nextInt();
        }
//        System.out.println(Arrays.toString(numbers));
        int lp=0;
        int rp=numbers.length-1;
        int [] newnum = new int[n];

      for(int i=0; i<newnum.length; i++){
          if(numbers[i]%2==0){
              newnum[rp]=numbers[i];
              rp--;
          }
          if(numbers[i]%2==1){
              newnum[lp]=numbers[i];
              lp++;
          }
      }
        System.out.println(Arrays.toString(newnum));
    }
}
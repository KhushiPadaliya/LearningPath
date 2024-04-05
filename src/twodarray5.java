import java.util.Arrays;
import java.util.Scanner;

public class twodarray5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][]numbers = new int[3][3];
        for(int i=0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println("enter number : ");
                numbers[i][j] = input.nextInt();
            }

        }

        System.out.println(Arrays.deepToString(numbers));
      for(int i=0; i< numbers.length; i++){
          for(int j=0; j<numbers[i].length; j++){
              System.out.print(numbers[i][j] + " ");
          }

          System.out.println();
      }
   //   int max = numbers[0][0];
     // int min = numbers[0][0];

        for(int i=0; i< numbers.length; i++){
          int  max=numbers[i][0];
           int  min = numbers[i][0];
            for(int j=0; j<numbers[i].length; j++){
               if(numbers[i][j]>max){
                    max=numbers[i][j];
                }

                if(numbers[i][j]<min){
                   min=numbers[i][j];
               }
            }
            System.out.println("max number in row : " + max);
            System.out.println("min number in row : " + min);

            System.out.println();
        }
       // System.out.println(max);
        //System.out.println(min);

    }
}


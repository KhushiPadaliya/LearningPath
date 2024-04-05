import java.util.Arrays;
import java.util.Scanner;

public class twodarray4 {
    public static void main(String[] args) {
        int n=0;
        int row;
        int colum;
     //   Scanner input = new Scanner(System.in);

   int[][]numbers = {{1,2,3},{4,5,6},{7,8,9,10,11}};
//   for(int i=0; i<numbers.length; i++){
//       for(int j=0; j<numbers[i].length; j++) {
//           System.out.println("enter number :");
//           numbers[i][j]= input.nextInt();
//       }
//   }
        System.out.println(Arrays.deepToString(numbers));

   for(int i=0; i < numbers.length; i++){
       for(int j =0; j < numbers[i].length; j++){
         //  System.out.print(numbers[i][j]+" ");
           n=n+numbers[i][j];
       }
       System.out.println("sum of row is " + n);
       n=0;
       System.out.println();
   }
        System.out.println("****************");
   for(int j=0; j < numbers.length; j++){
       for(int i=0; i<numbers[j].length; i++){
           n=n+numbers[i][j];
       }
       System.out.println("sum of colum is " + n);
       n=0;
       System.out.println();
   }


   }


}


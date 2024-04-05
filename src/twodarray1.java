/*
{
{1   2   3};
{4   5   6};
{7   8   9}

}
 */




import java.util.Arrays;
import java.util.Scanner;

public class twodarray1 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

     int [][] num = new int[3][3];
     int [][] num1 = new int[3][3];
     for(int i=0; i<num.length; i++){
         for(int j=0; j< num[i].length; j++){
             System.out.println("enter value :");

             num[i][j]=input.nextInt();
         }

     }
        for(int i=0; i<num1.length; i++){
            for(int j=0; j< num1[i].length; j++){
                System.out.println("enter value for second:");

                num1[i][j]=input.nextInt();
            }

        }
        int [] [] ans = new int [3][3];
        for (int i = 0 ; i < num.length; i ++)
        {
            for(int j = 0 ; j<num[i].length;j++)
            {
                ans[i][j] = num1[i][j] + num[i][j];
            }
        }
        for(int i = 0 ; i < ans.length ; i++)
        {
            System.out.println(Arrays.toString(ans[i]));
        }
    }
}

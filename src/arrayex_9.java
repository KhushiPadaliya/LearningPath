import java.util.Scanner;

public class arrayex_9
{
    public static void main(String[] args) {
        System.out.println("ENter raw: ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 1 ; i <= n ; i ++)
        {
            for(int j = 1 ;  j  <= 2* n ; j ++ )
            {
                if( j <= i || (j > n)&& j>2*n - i)
                {
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}

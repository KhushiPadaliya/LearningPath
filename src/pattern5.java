import java.util.Scanner;

public class pattern5 {
    public static void main(String[] args) {
        System.out.println("enter your number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a =1;

        for(int i=1; i<=n; i++) {
            for (int j = 1; j <= i; j++){
                a++;
              if(a%2==0){
                  System.out.print(1);
              }
              else{
                  System.out.print(0);
              }


            }
            System.out.println();
        }

    }
}

import java.util.Scanner;

public class patter6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number : ");
        int n = input.nextInt();
        for(int i=1; i<=n+1; i++){
            for(int k=1; k<i; k++ ){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        }
    }


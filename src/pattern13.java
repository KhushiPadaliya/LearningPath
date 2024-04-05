import java.util.Scanner;

public class pattern13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number : ");
        int n = input.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1; i<=n; i++){
            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

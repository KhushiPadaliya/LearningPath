import java.util.Scanner;

public class patern11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your number: ");
        int n = input.nextInt();
        for(int i=1; i<=n; i++){
            for(int k=2; k<i*2; k++){
                System.out.print(" ");
            }
            for(int j=n; j>=i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

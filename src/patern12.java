import java.util.Scanner;

public class patern12 {
    public static void main(String[] args) {
        System.out.println("enter number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=n; i>=1; i--){
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

import java.util.Scanner;
public class pattern4 {
    public static void main(String[] args) {
        System.out.println("enter your number : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

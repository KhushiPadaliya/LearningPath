import java.util.Scanner;

public class petern15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number : ");
        int n= input.nextInt();
        int a=1;
        for(int i=1; i<=n; i++){
            a=i;
            for(int k=1; k<i; k++ ){
                System.out.print(" ");
            }
                for(int j=n; j>=i; j--){
                    System.out.print(a + " ");
                    a++;
                }
            System.out.println();

        }
    }
}

import java.util.Scanner;
public class patter1 {
        public static void main(String[] args) {
            System.out.println("enter your number: ");
            Scanner input = new Scanner(System.in);
            int n = input.nextInt();
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if((i==1)||(i==n)||(j==1)||(j==n)){
                        System.out.print("* ");
                    }
                    else{

                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
    }



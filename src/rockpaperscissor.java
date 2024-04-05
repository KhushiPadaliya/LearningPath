import java.util.Random;
import java.util.Scanner;

public class rockpaperscissor {
    public static void main(String[] args) {
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor!!! ");
        Scanner sc = new Scanner(System.in);
        int Userinput = sc.nextInt();
        Random random = new Random();
        int computerInput = random.nextInt(3);
        while (Userinput <= 2 && Userinput >= 0) {
        System.out.println("computer choice : " + computerInput);
            if (Userinput == 0 && computerInput == 2 || Userinput == 1 && computerInput == 0 || Userinput == 2 && computerInput == 1) {
                System.out.println("You Win !!!!");
            } else if (Userinput == computerInput) {
                System.out.println("Draw!!");

            } else {
                System.out.println("computer win");
            }
        }



    }

}

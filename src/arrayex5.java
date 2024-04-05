import java.util.Scanner;

public class arrayex5 {
    public static void main(String[] args) {
        System.out.println("enter your phhone number : ");
        Scanner input = new Scanner(System.in);
        String  n = input.nextLine();
while(true){
    if(n.length()==10){
        System.out.println("welcome!!");

        break;
    }
    else{
        System.out.println("enter vaild number:");
        n= input.nextLine();

    }

}
    }
    }


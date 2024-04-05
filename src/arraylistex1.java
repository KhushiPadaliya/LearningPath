import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arraylistex1 {
    public static void main(String[] args) {
        ArrayList <Integer>numbers = new ArrayList<>();
        Scanner input = new Scanner (System.in);
        for(int i=0;  i<=5; i++ ){
            System.out.println("enter number : ");
          int  n = input.nextInt();
        }
        Collections.sort(numbers);
        System.out.println(numbers);

    }
}

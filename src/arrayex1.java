import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class arrayex1 {
    public static void main(String[] args) {
        System.out.println("how many number you want to enter : (numbers must be between 1 to 5)");
        Scanner input = new Scanner(System.in);
        int  n=0;
        while(true) {
            n = input.nextInt();
            if ((n <= 5 && n >= 1)) {
               break;
            }
            else {
                System.out.println("enter number is not valid try again");
                System.out.println("enter number");
            }
        }
            Point[]points=new Point[n];
            for(int i=0; i<points.length; i++){
                System.out.println("enter number x and y : ");
                points[i]= new Point(input.nextInt(),input.nextInt());


            }
       // System.out.println(Arrays.toString(points));
        for(int i=0;  i<points.length; i++){
            System.out.println(points[i].x + " , " + points[i].y);

        }



//        while(n>5|| n<1){
//            System.out.println("entered number is not valid!! try again: ");
//            n= input.nextInt();
//        }
//       int[] numbers = new int[n];
//
//            for (int i = 0; i < numbers.length; i++) {
//                System.out.println("enter number : ");
//                numbers[i] = input.nextInt();
//            }
//            System.out.println(Arrays.toString(numbers));

    }
}

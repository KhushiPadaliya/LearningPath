import java.util.Arrays;
import java.util.Scanner;

public class arraypractice2 {
    public static void main(String[] args) {
        System.out.println("how many numbers you want to enter : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("enter number : ");
            numbers[i] = input.nextInt();
        }
       // Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println("which number you want to enter:   ");
        n = input.nextInt();
//        if (Arrays.binarySearch(numbers,n) >= 0) {
//            System.out.println(Arrays.binarySearch(numbers,n));
//        }
//        else{
//            System.out.println("numbers does not exist: ");
//        }
        int c=-1;
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]==n) {
                c++;
            }
        }

     if(c>=0){
         System.out.println(c+1 + " times number " + n + " present in array");
     }
     else{
         System.out.println(" number does not exist: \n" + " 0 times number "+ n + " present in array ");
     }

    }
}

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 6, 2, 3, 27, 28, 10, 15};
        Arrays.sort(numbers);
        printArray(numbers);
        System.out.println(numbers[numbers.length-2]);
    }
    public static void printArray(int[]numbers){
        System.out.println(Arrays.toString(numbers));
    }
}

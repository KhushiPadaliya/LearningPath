import java.util.Arrays;

public class arraybinarysearch {
    public static void main(String[] args) {
        int [] numbers ={1,2,3,4,5,7,8};
        Arrays.binarySearch(numbers,5);
        System.out.println(Arrays.binarySearch(numbers,5));
        binarySearch(numbers);
    }

    private static void binarySearch(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
    }
}

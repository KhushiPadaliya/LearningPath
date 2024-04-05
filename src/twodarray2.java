import java.util.Arrays;

public class twodarray2 {
    /*
    1 2 3
    4 5 6   or  123456
 ****************AND**************
 14
 25
 36 or 142536
     */
    public static void main(String[] args) {
        int [][] numbers = {{1,2,3}, {4,5,6}};
        for(int i=0; i<3; i++){
            for(int j =0; j<2; j++){
                System.out.print(numbers[j][i] + " ");

            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(numbers));

    }
}

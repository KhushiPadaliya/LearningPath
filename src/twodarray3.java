import java.util.Arrays;

/*
1 2 3
3 4 5 6 7
8 9 0

1 3 8
2 4 9
3 5 0
  6
  7
 */
public class twodarray3 {
    public static void main(String[] args) {
        int [][]numbers  = {{1,2},{3,4},{8,9}};
        for(int j=0; j<numbers[j].length; j++){
            for(int i=0; i<numbers.length; i++){
                System.out.print(numbers[i][j]+ " ");
            }
           System.out.println();
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.deepToString(numbers));
    }
}

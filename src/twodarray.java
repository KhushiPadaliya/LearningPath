import java.util.Arrays;

public class twodarray {
    public static void main(String[] args) {
        int [][] num = {{1,2,3} ,{3,4,5}};
       // System.out.println(num[0]);
        //System.out.println(Arrays.toString(num[0]));
        for(int i=0; i<3; i++){
            for(int j=0; j<2; j++)
        System.out.println(num[j][i]+ " ");
        }
    }
}

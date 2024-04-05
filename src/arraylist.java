import java.util.ArrayList;

public class arraylist {
    public static void main(String[] args) {
        //use of array******

//        int [] arr = {5,0,1,3,4};
//        int i=0;
//        for(int num : arr){
//            System.out.println(num + " " + i++);
//        }

        // use of arraylist****

        ArrayList <String> items = new ArrayList<>();
        items.add("1st thing");
        items.add("2nd thing");
        items.add("3rd thing");
        for(String thing : items){
            System.out.println(thing + " " );
        }

    }
}

import java.util.Scanner;

public class practiceoop3 {
    public static void main(String[] args) {
        System.out.println("enter side os square : ");
        Scanner input = new Scanner(System.in);
        float n1 = input.nextFloat();
        square s1 = new square();
        s1.side = n1;
        s1.squaArea();
        s1.squaPerimeter();


    }
}
class square{
    float side;
    float area;
    float perimeter;

   public void squaArea(){
       float area =  side*side;
       System.out.println("Area is = " + area);
   }
   public void squaPerimeter(){
       float perimeter = 4*side;
       System.out.println("perimeter is = " + perimeter);
   }

}

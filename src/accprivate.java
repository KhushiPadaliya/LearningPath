import java.util.Scanner;

public class accprivate {
    public static void main(String[] args) {
        System.out.println("enter circle's radius");
        circle c1 = new circle();
        c1.setRadius(3);
        System.out.println(c1.getRadius());



    }
}
class circle{
    private int radius;
    private int area;

    public void setRadius(int radius){
        this.radius=radius;
    }
    public int getRadius(){
        return radius;
    }

}

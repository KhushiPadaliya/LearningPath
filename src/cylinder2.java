public class cylinder2 {
    public static void main(String[] args) {
        cylinder3 c3 = new cylinder3();
        System.out.println("height " + c3.getHeight());
        System.out.println("radius " + c3.getRadius());
        System.out.println("volume " + c3.getVolume());
        System.out.println("surface " + c3.getSurface());



    }
}
class cylinder3{
    private int height;
    private int radius;
    private double volume;
    private double surface;
    public int getHeight(){
        return height;
    }
    public int getRadius(){
        return radius;
    }
    public  double getVolume(){
        return volume;
    }
    public double getSurface(){
        return surface;

    }
    public cylinder3(){
        height=3;
        radius=4;
        volume=3.14*radius*radius*height;
        surface=(2*3.14*radius*height)+(2*3.14*radius*radius);
    }

}

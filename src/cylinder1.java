public class cylinder1 {
    public static void main(String[] args) {
        cylinder c1 = new cylinder();
        rectangle r = new rectangle();
        rectangle r1 = new rectangle(6,5);
        System.out.println("length is : " + r.getLength());
        System.out.println("breadth is : " + r.getBreadth());
        System.out.println("length is :" + r1.getLength());

        System.out.println("breadth is :" + r1.getBreadth());
       //  c1.radius=2;
        // c1.height=4;   <--------without use of constructer

       c1.getRadius();
       c1.getHeight();
        c1.Volume();
        c1.Surface();
    }
}
class cylinder{
    int length;
    int breadth;
    public void getlength(){
        System.out.println("length : " + length);
    }
    public void getbreadth(){
        System.out.println("breadth : " + breadth);
    }
    int radius;
    int height;
    double surface;
     double volume;
    public void setRadius(){
        this.radius=radius;
    }
    public void getRadius() {
        System.out.println("radius : " + radius);

    }
    public void setHeight(){
        this.height=height;
    }
    public void getHeight(){
        System.out.println("height : " + height );

    }
    public void Volume(){
        volume =3.14*radius*radius*height;
        System.out.println("volume : " + volume);

    }
    public void Surface(){
        surface=(2*3.14*radius*height)+(2*3.14*radius*radius);
        System.out.println("surface : " + surface );
    }



   public cylinder(){ //<---------- with use of constructor
        height=3;
        radius=5;
    }

}
class rectangle{
    private int length;
    private int breadth;
    public rectangle(){
        this.length=4;
        this.breadth=5;
    }
    public rectangle(int length, int breadth){
        this.length=length;
        this.breadth=breadth;

    }
    public int getLength(){
        return length;
    }
    public int getBreadth()
    {
        return breadth;
    }

}

public class poly {
    public static void main(String[] args) {
        person p1 = new person();
        p1.displayheight();
        p1.displayheight(6);


    }
}
class person{
    int height;
    public void displayheight(){
        System.out.println("height is 7 ");
    }
    public void displayheight( int Isheight){
        System.out.println("height " + Isheight);

    }
}

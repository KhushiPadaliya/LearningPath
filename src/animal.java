import org.w3c.dom.ls.LSOutput;

public class animal {
    public static void main(String[] args) {
        animal1 a1= new animal1();
        a1.colour();
       dog d1 = new dog();
       d1.barking();
        d1.colour();
    }
}
class animal1{

    public void colour(){
        System.out.println("dog has black colour!!!!1");
    }

}
class dog extends animal1{
    String barking;
    public void barking(){
        System.out.println("dog is barking....!!!!!!");
    }

}


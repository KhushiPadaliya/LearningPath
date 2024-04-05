public class object {
    public static void main(String[] args) {
        Person s1 = new Person();
        s1.name="khushi";
        s1.age = 18;
        s1.height=23;

        System.out.println("name is " + s1.name);
        System.out.println("age is " + s1.age);
        s1.displayheight();
        s1.displayheight(27);

    }
}
class Person{
    String name;
    int age;
    int height;
    public void displayheight(){
        System.out.println("height " + height );
    }
    public void displayheight(int isheight){
        System.out.println("height"+ isheight);
    }
}

public class oop3 {
    public static void main(String[] args) {
        human h1 = new human();
        man m1 = new man();


    }
}
class human{
    public void helloWorld(){
        System.out.println("hello!!");
    }
}
class man{
    String name;
    public void setName(String name){

        this.name=name;
    }
    public void getName(){
        System.out.println("name" + name);

    }

}
class woman{
    int age;
    public void setAge(int age){
        this.age = age;
    }
    public void getAge(){
        System.out.println("age " + age);
    }
}

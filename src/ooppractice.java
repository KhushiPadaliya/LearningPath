public class ooppractice {
    public static void main(String[] args) {
       // manager m1 = new employee();
        employee e1 = new manager();
        employee e2 = new employee();
       // m1.meetingTime
        e1.helloWorld();
        e1.setName("person1");
        e1.getName();
        e1.setSalary(10000000);
        e1.getSalary();
        e2.helloWorld();
        e2.setName("person2");
        e2.getName();
        e2.setSalary(100000);
        e2.getSalary();

    }
}
class manager extends employee
{
    long salary;
    int time;
    public void setSalary(long salary){

        this.salary=salary;
    }
    public void getSalary(){
        System.out.println("salary is = " + salary);
    }
    public void helloWorld(){
        System.out.println("details of manager : ");
    }
    public void meetingTime(int time){
        System.out.println(" at 10 O'clock");
    }


}
class employee{
    long salary;
    String name;

    public void setSalary(long salary){
        this.salary=salary;
    }
    public void setName(String name){
        this.name=name;
    }
    public void getName(){
        System.out.println("name = " + name);
    }
    public void getSalary(){
        System.out.println( "salary is " + salary);
    }
    public void helloWorld(){
        System.out.println("details of employee : ");
    }

}


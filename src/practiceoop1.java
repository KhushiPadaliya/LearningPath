public class practiceoop1 {

    public static void main(String[] args) {
        System.out.println("welcome!!!!!");
        employee1 e1 = new employee1();
        e1.name="khushi";
        e1.salary=2000000;
        e1.setName();
        e1.getName();
        e1.getSalary();

    }

}
class employee1{
     int salary;
     String name;
     public int getSalary(){
         System.out.println("salary : " + salary);
         return salary;
     }
     public void setName(){
         this.name = name;

     }
     public void getName(){
         System.out.println("employee's name is " + name);
     }
}

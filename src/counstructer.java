
//use of counstructer and constructer overloading
public class counstructer {
    public static void main(String[] args) {
        MyMainEmployee n1 = new MyMainEmployee();
        MyMainEmployee n2 = new MyMainEmployee("khushi",12);
        MyMainEmployee n3 = new MyMainEmployee(65);
        System.out.println(n3.getName());
        System.out.println(n3.getId());
        System.out.println(n2.getName());
        System.out.println(n2.getId());

        System.out.println(n1.getName());
        System.out.println(n1.getId());
    }
}
class MyMainEmployee{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
   public  MyMainEmployee(){
        id=34;
        name = "preet";

    }
    public MyMainEmployee(String myname , int myid){
        id = myid;
        name = myname;

    }
   public MyMainEmployee(int myid){
        name = "srushti";
        id=myid;
   }
}


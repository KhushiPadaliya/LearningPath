import java.util.Scanner;

class oop1 {
    public static void main(String[] args) {
        System.out.println("enter value of r1 : ");
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        rectuangle r1 =new rectuangle();
        rectuangle re = new rectuangle();
        r1.height=n1;
        rectuangle r2 = r1;
        System.out.println(r1.height);
        System.out.println(r2.height);
        re.height=23;
        r1=re;
        r2=r1;
        System.out.println(r1.height);
        System.out.println(r2.height);

    }

}
class  rectuangle{
    double width;
    double height;
}
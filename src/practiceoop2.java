public class practiceoop2 {
    public static void main(String[] args) {
        cellphone c1 = new cellphone();
        c1.ringing();
        c1.vibrate();

    }
}
class cellphone{
    public void ringing(){
        System.out.println("phone is ringing....!!");
    }
    public void vibrate(){
        System.out.println("phone is vibrating.......!!!!!!!");
    }
}

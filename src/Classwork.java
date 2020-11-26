import tst.classes.ex.Payment;
import tst.classes.ex.User;

public class Classwork {

    public static void main(String[] args) {
        User newUser = new User("1");
        Payment newPay = new Payment("Telewizor", 7530);
        newUser.addPayment(newPay);
        newUser.getPayment();
        newPay.getRaport();
    }
}

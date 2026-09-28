interface Payment { void makePayment(double amount); }
class Easypaisa implements Payment {
    public void makePayment(double amount) { System.out.println("Paid Rs. " + amount + " using Easypaisa."); }
}
public class PaymentInterface {
    public static void main(String[] args) {
        Payment p = new Easypaisa(); p.makePayment(2500);
    }
}

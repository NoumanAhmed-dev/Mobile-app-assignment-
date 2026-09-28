class Payment { void pay() { System.out.println("Making payment."); } }
class Cash extends Payment { void pay() { System.out.println("Payment made by cash."); } }
class Card extends Payment { void pay() { System.out.println("Payment made by card."); } }
public class RuntimePolymorphism {
    public static void main(String[] args) {
        Payment p = new Card(); p.pay();
    }
}

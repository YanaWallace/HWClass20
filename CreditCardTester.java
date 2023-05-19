package HWClass20;

public class CreditCardTester {
    public static void main(String[] args) {
        CreditCard obj1 = new CreditCard(8000);
        obj1.calculateInterest();
        CreditCard obj2 = new Visa(9000);
        obj2.calculateInterest();
        CreditCard obj3 = new AX(12000);
        obj3.calculateInterest();
    }
}

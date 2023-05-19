package HWClass20;

public class CreditCard {
    protected double balance;
    protected double interest;
    public CreditCard(double balance) {
        this.balance = balance;
    }
    public void calculateInterest() {
        interest = balance * 0.9;
        System.out.println("Interest for Credit Card: " + interest);
    }
}

class Visa extends CreditCard {
    public Visa(double balance) {
        super(balance);
    }
}
class AX extends CreditCard {
    public AX(double balance) {
        super(balance);
    }
    @Override
    public void calculateInterest() {
        interest = balance * 0.8;
        System.out.println("Interest for AX Card: " + interest);
    }
}

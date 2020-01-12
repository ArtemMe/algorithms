package patterns.strategy;

public class PayByCreditCard implements PayStrategy {
    @Override
    public long pay(int payAmount) {
        System.out.println("Pay by credit card");
        System.out.println("getting id");
        return 1;
    }

    @Override
    public void collectPaymentDetails() {
        System.out.println("Collecting data from credit card");
    }
}

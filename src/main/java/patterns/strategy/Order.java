package patterns.strategy;

public class Order {
    public void process(PayStrategy payStrategy) {
        payStrategy.collectPaymentDetails();
    }
}

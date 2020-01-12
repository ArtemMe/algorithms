package patterns.strategy;

public interface PayStrategy {
    long pay(int payAmount);
    void collectPaymentDetails();
}

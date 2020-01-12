package patterns.strategy;

public class PayByPayPal implements PayStrategy {
    private boolean signedIn = false;

    @Override
    public long pay(int payAmount) {
        System.out.println("Process pay");
        if(signedIn) {
            System.out.println("Trying to connect to payPal api");
            System.out.println("Getting pay id");
        }
        return 0;
    }

    @Override
    public void collectPaymentDetails() {
        logInToPayPal();
    }

    private void logInToPayPal() {
        System.out.println("Collection data for login");
        System.out.println("try to login");
        signedIn = true;
    }
}

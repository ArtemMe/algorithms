package patterns.strategy;

public class Client {
    public static void main(String[] args) {
        Order o = new Order();
        PayStrategy card = new PayByCreditCard();
        PayStrategy payPal = new PayByPayPal();
        if(1==2)
            o.process(card);
        else
            o.process(payPal);
    }
}

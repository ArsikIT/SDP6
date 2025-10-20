package ConcreteStrategies;

import StartegyInterface.PaymentStrategy;

public class HalykBankStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Payment " + amount + "₸ through HaykBank");
    }
}

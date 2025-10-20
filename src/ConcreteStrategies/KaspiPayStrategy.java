package ConcreteStrategies;
import StartegyInterface.PaymentStrategy;

public class KaspiPayStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Payment " + amount + "₸ through Kaspi Pay");

    }
}

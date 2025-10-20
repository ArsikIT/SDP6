package ContextClass;

import StartegyInterface.PaymentStrategy;

public class PaymentContext {
    private PaymentStrategy strategy;

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;  // setting the selected strategy
    }

    public void executePayment(double amount) {  // payment completion
        if (strategy == null) {
            System.out.println("Error: the payment method is not selected!");
        } else {
            strategy.pay(amount);
        }

    }
}

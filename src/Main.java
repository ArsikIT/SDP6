import ConcreteStrategies.FreedomBankStrategy;
import ConcreteStrategies.HalykBankStrategy;
import ConcreteStrategies.KaspiPayStrategy;
import ContextClass.PaymentContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentContext context = new PaymentContext();  // the context where the strategy is chosen

        System.out.println("========== PAYMENT SYSTEM ==========");
        System.out.print("Enter amount (₸): ");
        double amount = scanner.nextDouble();  // entering amounts

        System.out.println("\nChoose payment method:");
        System.out.println("1. Kaspi Pay");
        System.out.println("2. Halyk Bank");
        System.out.println("3. Freedom Bank");
        System.out.print("Your choice: ");
        int choice = scanner.nextInt();  // entering payment strategy


        // choosing a strategy based on the input
        switch (choice) {
            case 1 -> context.setPaymentStrategy(new KaspiPayStrategy());
            case 2 -> context.setPaymentStrategy(new HalykBankStrategy());
            case 3 -> context.setPaymentStrategy(new FreedomBankStrategy());
            default -> {
                System.out.println("Invalid choice!");
                return;  // exit if the selection is incorrect
            }
        }

        context.executePayment(amount);

        System.out.println("====================================");
        scanner.close();
    }
}
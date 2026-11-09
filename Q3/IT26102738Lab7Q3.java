import java.util.Scanner;

public class IT26102738Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        for (int customer = 1; customer <= 5; customer++) {
            System.out.println("Customer " + customer);
            System.out.print("Enter total bill amount: ");
            double bill = input.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            String mode = input.next();

            if (mode.equalsIgnoreCase("C")) {
                double discount = bill * 5 / 100;
                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + (bill - discount));
            } else if (mode.equalsIgnoreCase("O")) {
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + bill);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }
            System.out.println();
        }
    }
}
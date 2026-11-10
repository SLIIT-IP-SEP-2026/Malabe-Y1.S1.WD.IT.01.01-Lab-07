
import java.util.Scanner;

public class IT26102543Lab7Q3 {
    public static void main(String[] args) {

        final double discountRate = 0.05;
        double billAmount, discount;
        double amountToPay = 0;
        char paymentMode;

        Scanner input = new Scanner(System.in);

        for (int count = 1; count <= 5; count++) {

            System.out.println("Customer " + count);
            System.out.println("Enter total bill amount:");
            billAmount = input.nextDouble();

            System.out.println("Enter mode of payment (C for cash, O for other):");
            paymentMode = input.next().toUpperCase().charAt(0);

            if (paymentMode == 'C' || paymentMode == 'c') {
                discount = billAmount * discountRate;
                System.out.println("Discount is: " + discount);
                amountToPay = billAmount - discount;
            }
            else if (paymentMode == 'O' || paymentMode == 'o') {
                discount = 0;
                amountToPay = billAmount;
                System.out.println("No discount applicable");
            }
            else {
                System.out.println("Payment Mode is not valid");
                continue;
            }

            System.out.println("Amount to be paid: " + amountToPay);
            System.out.println();
        }
    }
}

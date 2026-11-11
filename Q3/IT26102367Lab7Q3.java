
import java.util.Scanner;

public class IT26102367Lab7Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double billAmount;
        double discount;
        double amountToPay;
        char paymentMode;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Customer " + i);

            System.out.print("Enter total bill amount: ");
            billAmount = input.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            paymentMode = input.next().charAt(0);

            paymentMode = Character.toUpperCase(paymentMode);

            if (paymentMode == 'C') {

                discount = billAmount * 5 / 100;
                amountToPay = billAmount - discount;

                System.out.println("Discount is: " + discount);
                System.out.println("Amount to be paid: " + amountToPay);

            }
            else if (paymentMode == 'O') {

                amountToPay = billAmount;

                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + amountToPay);

            }
            else {

                System.out.println("Payment Mode is Not Valid");

            }

            System.out.println();
        }

    }
}

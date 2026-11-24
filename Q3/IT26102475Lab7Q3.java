
import java.util.Scanner;

public class IT26102475Lab7Q3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double billAmount;
        double discount;
        double amountToPay;
        String paymentMode;

        for (int customer = 1; customer <= 5; customer++) {

            System.out.println("Customer " + customer);

            System.out.print("Enter total bill amount: ");
            billAmount = input.nextDouble();

            System.out.print("Enter mode of payment (C/O): ");
            paymentMode = input.next();

            if (paymentMode.equalsIgnoreCase("C")) {

                discount = billAmount * 5 / 100;

                amountToPay = billAmount - discount;

                System.out.println("Discount is: " + discount);
                System.out.println("Amount to be paid: " + amountToPay);

            }
            else if (paymentMode.equalsIgnoreCase("O")) {

                discount = 0;

                amountToPay = billAmount;

                System.out.println("Discount is: " + discount);
                System.out.println("Amount to be paid: " + amountToPay);

            }
            else {

                System.out.println("Payment Mode is Not Valid");

            }

            System.out.println();

        }

        input.close();
    }
}


import java.util.Scanner;

public class IT26102353Lab7Q3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double totalBill, discount, amountToPay;
        String paymentMode;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Customer " + i);

            System.out.print("Enter total bill amount: ");
            totalBill = input.nextDouble();

            System.out.print("Enter payment mode (C/O): ");
            paymentMode = input.next();

            while (!paymentMode.equalsIgnoreCase("C") &&
                   !paymentMode.equalsIgnoreCase("O")) {

                System.out.println("Payment Mode is Not Valid");

                System.out.print("Enter payment mode (C/O): ");
                paymentMode = input.next();
            }

            if (paymentMode.equalsIgnoreCase("C")) {
                discount = totalBill * 0.05;
            } 
            else {
                discount = 0;
            }

            amountToPay = totalBill - discount;

            System.out.println("Discount = " + discount);
            System.out.println("Amount to be paid = " + amountToPay);

            System.out.println();
        }
    }
}

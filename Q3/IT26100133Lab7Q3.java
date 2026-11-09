import java.util.Scanner;

public class IT26100133Lab7Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double bill, discount, amountToPay;
        char mode;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);

            System.out.print("Enter total bill amount: ");
            bill = input.nextDouble();

            System.out.print("Enter mode of payment (C/O): ");
            mode = input.next().toUpperCase().charAt(0);

            if (mode == 'C') {
                discount = bill * 0.05;
                amountToPay = bill - discount;

                System.out.println("Discount amount: " + discount);
                System.out.println("Amount to be paid: " + amountToPay);

            } else if (mode == 'O') {
                discount = 0;
                amountToPay = bill;

                System.out.println("Discount amount: " + discount);
                System.out.println("Amount to be paid: " + amountToPay);

            } else {
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println();
        }
    }
}
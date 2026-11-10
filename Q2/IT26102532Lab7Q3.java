import java.util.Scanner;

public class IT26102532Lab7Q3v2 {

    public static void main(String[] args) {
    // Declaring the constants and variables
    final double discount_rate = 0.05;
    final int number_of_customers = 5;
    double billAmount, amountToPay;
    char paymentMode;

    double discount = 0;

    // Creating scanner input
    Scanner input = new Scanner (System.in);

    for (int customerCount = 1 ; customerCount <= number_of_customers; customerCount++){

        System.out.println("Customer: " + customerCount);

        System.out.print("Enter the total Bill Amount: ");
        billAmount = input.nextDouble();

        System.out.print("Enter the mode of payment (C for cash, O for others): ");
        paymentMode = input.next().toUpperCase().charAt(0);

        if (paymentMode == 'C'){
            // Calculate the discount
            discount = billAmount * discount_rate;
            amountToPay = billAmount - discount;

            System.out.println("Discount is : " + discount);
            System.out.println("Amount to be Paid : " + amountToPay);
        } else if (paymentMode == 'O') {
            // No discount
            amountToPay = billAmount;
            System.out.println("No discount applicable ");
            System.out.println("Amount to be Paid : " + amountToPay);
        } else {
            // Invalid
            System.out.println("Payment mode is not valid");
            System.out.println("");

            // Skip to the next customer
            continue;
        }

        System.out.println("");
    }

    }
}
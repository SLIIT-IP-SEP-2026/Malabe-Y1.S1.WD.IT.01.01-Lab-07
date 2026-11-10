import java.util.Scanner;

public class IT261024346Lab7Q3 {

    public static void main(String[] args) {

        
        int customerCount;
        double totalAmount, discount, amountToPay;
        char paymentMode;

        Scanner input = new Scanner(System.in);

        
        for (customerCount = 1; customerCount <= 5; customerCount++) {

            System.out.println("Customer " + customerCount);

            
            System.out.print("Enter total bill amount: ");
            totalAmount = input.nextDouble();

           
            System.out.print("Enter mode of payment (C for cash, O for other): ");
            paymentMode = input.next().charAt(0);

           
            if (paymentMode == 'C' || paymentMode == 'c') {

               
                discount = totalAmount * 5 / 100;

                
                amountToPay = totalAmount - discount;

                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + amountToPay);

            } else if (paymentMode == 'O' || paymentMode == 'o') {

                
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + totalAmount);

            } else {

                
                System.out.println("Payment Mode is Not Valid");
            }

            System.out.println();
        }
    }
}
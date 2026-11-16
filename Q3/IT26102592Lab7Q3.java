import java.util.Scanner;

public class IT26102592Lab7Q3 {

public static void main(String [] args) {
	
	final double DISCOUNT_RATE = 0.05;
	final int NUMBER_OF_CUSTOMERS = 5;
	double billAmount, amountToBePay;
	char paymentMode;
	
	double discount = 0;
	Scanner input = new Scanner(System.in);
	
	for(int coustomercount =1; coustomercount <= NUMBER_OF_CUSTOMERS; coustomercount++){
		System.out.println("Customer" +coustomercount);
		
		System.out.print("Enter the total bill amount: ");
		billAmount = input.nextDouble();
		
		System.out.print("Enter the mode of payment (C for cash, O for other): ");
		paymentMode = input.next().toUpperCase().charAt(0);
		
		if(paymentMode == 'C') {
			//cal discount
			discount = billAmount* DISCOUNT_RATE;
			amountToBePay = billAmount - discount;
			
			System.out.println("Discount id: "+discount);
			System.out.println("Amount to be paid: " +amountToBePay);
		}
		else if (paymentMode == 'O') {
			//no discount
			amountToBePay = billAmount;
			
			System.out.println("No Discount Applicable");
			System.out.println("Amount to be paid: "+amountToBePay);
		}
		else {
			//invalid option
			System.out.println("Payment Mode Is Not Valid");
			System.out.println(" ");
			
			continue; //skip to the next customer
	}
	System.out.println(" ");
	
}
}
}
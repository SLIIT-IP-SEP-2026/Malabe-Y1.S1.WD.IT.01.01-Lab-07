import java.util.Scanner;

public class IT26102623Lab7Q3{
	
	public static void main(String [] args){
		
		final double DISCOUNT_RATE = 0.05;
		final int NUMBER_OF_CUSTOMERS = 5;
		
		int customer;
		double billAmount, finalAmount,discountAmount;
		
		Scanner input = new Scanner(System.in);
	
		
		for (customer = 1; customer <=NUMBER_OF_CUSTOMERS; ++customer)
		{
			System.out.println("Customer " + customer);
			System.out.print("Enter total bill amount: ");
			billAmount = input.nextDouble();
			
			System.out.print("Enter mode of payment (C for cash, O for other): ");
			char mode = input.next().toUpperCase().charAt(0);
			
			
			if (mode == 'C'){
				
				discountAmount = billAmount*DISCOUNT_RATE;
				finalAmount = billAmount - discountAmount;
				System.out.println("Discount is : "+ discountAmount);
				System.out.println("Amount to be paid: " + finalAmount);
				
			}
					
			else if(mode == 'O'){
				System.out.println("No discount applicable");
				System.out.println("Amount to be paid: " + billAmount);
				
			}
			else {
				System.out.println("Payment Mode is Not Valid ");
				
			
				
			
			}
			System.out.println();
			continue;
			
				
			
		}
	}
}
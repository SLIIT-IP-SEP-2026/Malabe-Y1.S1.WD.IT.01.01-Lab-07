import java.util.Scanner;
public class IT26102407Lab7Q3{
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		final double discount_rate = 0.05;
		double amount , discount , finalAmount;
		char paymentMode ; 
		int customerCount;
		
		for(customerCount = 1 ; customerCount <= 5 ; customerCount++)
		{
			System.out.println("Customer " + customerCount);
			
			System.out.print("Enter total bill amount: ");
			amount = input.nextDouble();
			
			System.out.print("Enter mode of payment (C for cash, O for other): ");
			paymentMode = input.next().charAt(0); 
			
			if (paymentMode == 'C' || paymentMode == 'c')
			{
				discount = amount * discount_rate;
				System.out.println("Discount is : " + discount);
				
				finalAmount = amount - discount;
				System.out.println("Amount to be paid: " + finalAmount);
			}
			else if (paymentMode == 'O' || paymentMode == 'o')
			{
				System.out.println("No discount applicable");
				System.out.println("Amount to be paid: " + amount);
			}
			else
			{
				System.out.println("Payment mode is not valid");
				System.out.println();
				continue;
			}
			System.out.println();
			
			
		}
		
	}
	
}
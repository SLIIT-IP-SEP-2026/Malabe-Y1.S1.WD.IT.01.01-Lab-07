import java.util.Scanner;

public class IT26102472Lab7Q3{
	
	public static void main(String[]args){
		
		final double DISCOUNT_RATE = 0.05;
		final int NUMBER_OF_CUSTOMERS = 5;
		double billAmount, amounttoPay;
		char PaymentMode;
		double discount = 0;
		
		Scanner input = new Scanner(System.in);
		
		for (int customercount = 1; customercount <= NUMBER_OF_CUSTOMERS; customercount++){
			
			System.out.println("customer :" +customercount);
			
			System.out.println("Ener the total Bill Amount :");
			billAmount = input.nextDouble();
			
			System.out.println("Enter the mod of payment (C for cash, 0 faor other ):");
			PaymentMode = input.next().toUpperCase().charAt(0);
			
			if (PaymentMode =='C'){
				discount = billAmount*DISCOUNT_RATE;
				amounttoPay = billAmount-discount;
				
				System.out.println("Discount is : "+discount);
				System.out.println("Amount to be Paid : " +amounttoPay);
			}
			
			else if(PaymentMode == '0'){
				amounttoPay = billAmount;
				
				System.out.println("Payment Mode is Not Valid");
				System.out.println("Amount to be Paid : "+amounttoPay);
			}
			
			else {
				System.out.println("Payment Mode is Not Valid");
				System.out.println("");
			}
			System.out.println("");
		}
	}
}
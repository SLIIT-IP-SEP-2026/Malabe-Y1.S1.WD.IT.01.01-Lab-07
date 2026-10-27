import java.util.Scanner;

public class IT26102376Lab7Q3
{
   public static void main(String [] args)
   {
	   final double DISCOUNT_RATE = 0.05  ;
	   final int NUMBER_OF_COUSTERMERS = 5;
	   double billAmount , amounttoPay , discount;
	   char paymentMode ;
	   
	   Scanner input = new Scanner(System.in);
	   
	   for (int customerCount = 1 ; customerCount <= NUMBER_OF_COUSTERMERS ; customerCount++)
	   {
		   System.out.println("customer : " +customerCount);
		   
		   System.out.print("Enter the total Bill Amount : ");
		   billAmount = input.nextDouble();
		   
		   System.out.print("Enter the mode of payment (C for cash, O for other : ");
		   paymentMode = input.next().toUpperCase().charAt(0);
		   
		   if (paymentMode == 'C')
		   {
			   discount = billAmount*DISCOUNT_RATE;
			   amounttoPay = billAmount-discount;
			   
			   System.out.println("Discount is : " + discount);
			   System.out.println("Amount to be Paid : " +amounttoPay);
		   }
		   
		   else if (paymentMode == 'O')
		   {
			   System.out.println("No Discount Applicable");
			   System.out.println();
		   }
		   
		   else
		   {
			   System.out.println("Payment Mode is not Valid");
		       System.out.println();
			   
			   continue;
		   }
		   
		   System.out.println();
	   }
   }
}
		   
			   
		   
		   
		   
		   
	   
	   
	   
	   
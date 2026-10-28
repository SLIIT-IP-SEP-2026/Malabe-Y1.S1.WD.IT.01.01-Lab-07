import java.util.Scanner;

public class IT26102590Lab7Q3{

 public static void main(String[]args){
 
	Scanner input=new Scanner(System.in);
	char modeOfPayment;
	int customer;
	final double DISCOUNT = 0.05;
 
 for (customer=1; customer<=5; ++customer)
 
	{ System.out.println("Customer No"+customer);
	
		double totalBill=0;
	
	 System.out.print("Enter the total bill amount:");
	  totalBill = input.nextDouble();
	 
	 System.out.println("Enter the mode of payment (C for Cash and O for Others):");
	  modeOfPayment= input.next().toUpperCase().charAt(0);
	 
	 if (modeOfPayment=='C')
	 {	System.out.println("You obtained a 5% discount");
		double finalBill = totalBill- (totalBill*DISCOUNT);
	 
		System.out.println ("Your finall total :Rs."+ finalBill);}
	 
		else if (modeOfPayment=='O')
		{
		System.out.println("You are not aligible to obtain the discount");
		
		}
	
	
			else {System.out.println("Invalide mode of payment");}
	}
 }
}
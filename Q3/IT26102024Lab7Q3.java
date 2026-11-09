import java.util.Scanner;

public class IT26102024Lab7Q3{
	public static void main (String[]args){

		final double DISCOUNT_RATE = 5.0;

		double bill, discount;
		char mode;

		Scanner input = new Scanner(System.in);

		for (int customer = 1; customer <= 5; customer++){

			System.out.println("Customer "+customer);

			System.out.print("Enter total bill amount: ");
			bill = input.nextDouble();

			System.out.print("Enter mode of payment (C for cash, O for other): ");
			mode = input.next().charAt(0);

			if (mode == 'C' || mode == 'c'){

				discount = bill * DISCOUNT_RATE / 100;

				System.out.println("Discount is : "+discount);
				System.out.println("Amount to be paid: "+(bill - discount));

			}else if (mode == 'O' || mode == 'o'){

				System.out.println("No discount applicable");
				System.out.println("Amount to be paid: "+bill);

			}else{

				System.out.println("Payment Mode is Not Valid");

			}

			if (customer < 5){
				System.out.println();
			}
		}

	}
}

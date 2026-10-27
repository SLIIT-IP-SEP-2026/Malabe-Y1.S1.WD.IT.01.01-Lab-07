import java.util.Scanner;
public class IT26102386Lab7Q3
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
        double totalDiscount = 0;
		int i;
		for(i=1;i<=5;i++){
			System.out.println("Customer" +i);
			System.out.print("Enter total bill Amount:");
			double billAmount=input.nextDouble();
			System.out.print("Enter mode of payment (C for Cash, O for Other): ");
            char mode = input.next().charAt(0);
			double discount = 0;
			 if (mode == 'C' || mode == 'c') {
                discount = billAmount * 0.05;
				System.out.println("Discount is: " + discount);
                double amountToPay = billAmount - discount;
				System.out.println("Amount to be paid: " + amountToPay);
            } else if (mode == 'O' || mode == 'o') {
				String str= "No Discount Applicable";
				System.out.println(str);
				double amountToPay = billAmount;
                System.out.println("Amount to be paid: " + amountToPay);
			} else {
                System.out.println("Payment mode is not valid");
				System.out.println(" ");
				continue;
			}
			System.out.println(" ");
		}
		
	}
}
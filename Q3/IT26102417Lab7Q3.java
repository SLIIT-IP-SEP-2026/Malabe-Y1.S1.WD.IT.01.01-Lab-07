import java.util.Scanner;

public class IT26102417Lab7Q3{
    public static void main(String[]args){
		
	 Scanner input = new Scanner(System.in);
  for(int count = 1 ; count <= 5 ; count++ ){
	  System.out.println("Customer " + count );
	  
     System.out.print("Enter total bill payment :");
	 double totalAmount =  input.nextDouble();
	 
	 System.out.print("Enter mode of paymemt(c for cash ,o for other):");
	 char paymemtMode = input.next().charAt(0);
	 
	 if (paymemtMode == 'c'|| paymemtMode == 'C'){
		 double discount = totalAmount * 0.05;
		 
		 double finalAmount = totalAmount - discount;
		 System.out.println("Disount is: " +discount );
		 System.out.print("Amount to be paid :" + finalAmount);
		 
	 }
     	 else if (paymemtMode == 'o'|| paymemtMode == 'O'){ 
		 
		 double finalAmount = totalAmount; 
		 System.out.println("NO dicount is applicable");
		 System.out.println("Amount to be paid :" + totalAmount);
		 
		 }
		
		else {
			System.out.println("payment mode is not valid");
		
		}
		
		System.out.println();
	
	}
		
		
	}
}
import java.util.Scanner;
	public class IT26102481Lab7Q3{
		public static void main(String[] args){
			
			Scanner input=new Scanner(System.in);
			
			int i;
			double bAmount,aAmount,discount;
			char mode;
			
			for(i=1;i<=5;i++){
				System.out.println("customer "+i);
				System.out.print("enter total bill amount: ");
				bAmount=input.nextDouble();
				System.out.print("enter mode of payment (c for cash, o for other): ");
				mode=input.next().charAt(0);
				
				if(mode== 'o' || mode== 'O'){
					System.out.println("no discount applicable");
					System.out.println("amount to be paid: "+bAmount);
					System.out.println();
				}else if(mode== 'c' || mode== 'C'){
					discount= bAmount/100*5;
					System.out.println("discount is : "+discount);
					aAmount=bAmount-discount;
					System.out.println("amount to be paid "+aAmount);
					System.out.println();
				}else{
					System.out.println("payment mode is not valid");
					
					System.out.println();
				}
				
				
				
				
				
				
				
				
			}
			
			
			
			
		}
	}
	
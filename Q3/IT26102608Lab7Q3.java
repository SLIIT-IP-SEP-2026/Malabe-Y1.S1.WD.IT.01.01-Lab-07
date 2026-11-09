import java.util.Scanner;

public class IT26102608Lab7Q3{

    public static void main(String[]args){
        
        double total, amountToBePaid= 0;
        char modeOfPayment;
        
        Scanner input = new Scanner(System.in);
        
        
        for (int count=1; count<=5; count++){
            System.out.println("Customer " + count);
            System.out.print("Enter total bill amount: " );
            total = input.nextDouble();
         
        System.out.print("Enter mode of payment (C for cash, O for other): " );
        modeOfPayment = input.next().charAt(0);
               
        if(modeOfPayment == 'C' || modeOfPayment == 'c'){
            amountToBePaid = total*0.95;
            System.out.println("Discount is: " + (total*0.05));
            System.out.println("Amount to be paid: " + amountToBePaid + "\n");;           
        }
        else if(modeOfPayment == 'O' || modeOfPayment == 'o'){
            System.out.println("No discount applicable");
            System.out.println("Amount to be paid : " + total + "\n");;
        }
        else{
            System.out.println("Payment Mode is not valid\n");
            }
            }
        input.close();        
        }    
    }

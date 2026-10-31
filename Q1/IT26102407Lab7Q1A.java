import java.util.Scanner;
public class IT26102407Lab7Q1A{
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		int mark1, mark2, mark3, mark4, sum;
		double avg;
		String grade;
		
		System.out.println("Enter marks for four subjects :");
		
		System.out.print("Enter Subject mark 01 :");
		mark1 = input.nextInt();
		
		System.out.print("Enter Subject mark 02 :");
		mark2 = input.nextInt();
		
		System.out.print("Enter Subject mark 03 :");
		mark3 = input.nextInt();
		
		System.out.print("Enter Subject mark 04 :");
		mark4 = input.nextInt();
		
		sum = mark1 + mark2 + mark3 + mark4;
		avg = sum/4;
		
		System.out.println();
		System.out.println("Average is: " + avg);
		
		if(avg >= 75)
		{
			grade = "Distinction";
		}
		else if (avg >= 50)
		{
			grade = "Credit";
		}
		else
		{
			grade = "Fail";
		}
		
		System.out.print("Overall Grade is: " + grade);
		
	}
	
}
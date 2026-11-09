import java.util.Scanner;

public class IT26102472Lab7Q1A{
	
	public static void main(String[]args){
		
		int mark;
		int total = 0;
		double average;
		
		System.out.println("Enter Marks for four Subjects:");
		
		Scanner input = new Scanner(System.in);
		
		for ( int subject = 1; subject <= 4; subject++){
			System.out.print("Enter Subject Mark " + subject + ": ");
			mark = input.nextInt();
			
			total = total + mark;
		}
		
		average = total/4;
		
		System.out.println("Average is : " +average);
		
		if ((average <= 100) && (average >= 75)){
			System.out.println("Overall Grade is : Distinction");
		}
		else if ((average <= 74) && (average >= 50)){
			System.out.println("Overall Grade is : Credit");
		}
		else {
			System.out.println("Overall Grade is : Fail");
		}
	}
}
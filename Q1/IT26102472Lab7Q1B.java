import java.util.Scanner;

public class IT26102472Lab7Q1B{
	
	public static void main(String[]args){
		
		int mark1, mark2, mark3, mark4;
		int studentCount = 1;
		double average;
		
		Scanner input = new Scanner(System.in);
		
		while (studentCount <=3){
			System.out.println("Student "+studentCount);
			System.out.print("Enter marks : ");
			mark1 = input.nextInt();
			mark2 = input.nextInt();
			mark3 = input.nextInt();
			mark4 = input.nextInt();
			
			average = ((mark1+mark2+mark3+mark4)/4.0);
		
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
			System.out.println();
			studentCount = studentCount+1;
		}
	}
}
import java.util.Scanner;
public class IT26102407Lab7Q1B{
	
	public static void main(String[]args){
		
		Scanner input = new Scanner(System.in);
		
		int mark1, mark2, mark3, mark4, sum;
		double avg;
		String grade;
		int StudentCount = 1;
		
		while(StudentCount <= 3)
		{
			System.out.println("Student " + StudentCount);
			
			System.out.print("Enter marks: ");
			mark1 = input.nextInt();
			mark2 = input.nextInt();
			mark3 = input.nextInt();
			mark4 = input.nextInt();
			
			sum = mark1 + mark2 + mark3 + mark4;
			avg = sum/4;
						
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
			
			System.out.println("Average is: " + avg);
			System.out.println("Overall Grade is: " + grade);
			System.out.println();
			
			StudentCount++;
		}
		
	}
	
}
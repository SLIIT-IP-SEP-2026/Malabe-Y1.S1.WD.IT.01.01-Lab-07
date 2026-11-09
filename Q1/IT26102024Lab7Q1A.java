import java.util.Scanner;

public class IT26102024Lab7Q1A{
	public static void main (String[]args){

		int mark, count = 1, total = 0;
		double average;
		String grade;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter marks for four subjects:");

		while (count <= 4){
			System.out.print("Enter Subject Mark "+count+": ");
			mark = input.nextInt();
			total = total + mark;
			count++;
		}

		average = total / 4.0;

		if (average >= 75){
			grade = "Distinction";
		}else if (average >= 50){
			grade = "Credit";
		}else{
			grade = "Fail";
		}

		System.out.println();
		System.out.println("Average is : "+average);
		System.out.println("Overall Grade is : "+grade);

	}
}

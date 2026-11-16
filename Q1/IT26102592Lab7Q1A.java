import java.util.Scanner;

public class IT26102592Lab7Q1A {

public static void main(String [] args) {
	
	//declare the variable
	int mark1 , mark2 , mark3 , mark4;
	double avg;
	String grade;
	
	Scanner input = new Scanner(System.in);
	//enter 4 subjects marks
	System.out.println("Enter the mark for four subjects: ");
	
	System.out.print("Enter subject mark 01: ");
	mark1 = input.nextInt();
	
	System.out.print("Enter subject mark 02: ");
	mark2 = input.nextInt();
	
	System.out.print("Enter subject mark 03: ");
	mark3 = input.nextInt();
	
	System.out.print("Enter subject mark 04: ");
	mark4 = input.nextInt();
	
	//calculate the average
	avg = (mark1+mark2+mark3+mark4)/4.0;
	
	//check the grade on avg
	if (avg >= 75) {
		grade = "Distinction";
	}
	else if (avg >= 50) {
		grade = "Credit";
	}
	else {
		grade = "Fail";
	}
	System.out.println();
System.out.println("Average is : " +avg);
System.out.println("Iverall Grade is: " +grade);
	
	
}
}
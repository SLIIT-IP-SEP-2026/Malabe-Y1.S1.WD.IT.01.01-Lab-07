import java.util.Scanner;
public class IT26102552Lab7Q1B{
    public static void main(String[] args) {
		
        int mark1, mark2, mark3, mark4;
        double avg;
        String grade;
		
        Scanner input = new Scanner(System.in);
		
		for (int student = 1; student <= 3; student++) {
  			System.out.println("Student " + student);
			
            System.out.print("Enter mark1: ");
			mark1 = input.nextInt();
			
			System.out.print("Enter mark2: ");
			mark2 = input.nextInt();
			
			System.out.print("Enter mark3: ");
			mark3 = input.nextInt();
			
			System.out.print("Enter mark4: ");
			mark4 = input.nextInt();
			
            avg = (mark1 + mark2 + mark3 + mark4) / 4.0;
			
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
        System.out.println("Average is: " + avg);
        System.out.println("Overall Grade is: " + grade);
		System.out.println();
		}
    }
}

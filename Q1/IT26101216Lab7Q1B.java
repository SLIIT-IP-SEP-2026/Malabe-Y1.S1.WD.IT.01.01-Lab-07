import java.util.Scanner;

public class IT26101216Lab7Q1B {
    public static void main(String[] args) {

        // Declare variables
        int mark1, mark2, mark3, mark4;
        double avg;
        String grade;

        Scanner input = new Scanner(System.in);

        int studentCount = 1;

        while (studentCount <= 3) {

            System.out.println("Student " + studentCount);
            System.out.print("Enter marks: ");

            // Enter four marks in one line
            mark1 = input.nextInt();
            mark2 = input.nextInt();
            mark3 = input.nextInt();
            mark4 = input.nextInt();

            // Calculate average
            avg = (mark1 + mark2 + mark3 + mark4) / 4.0;

            System.out.println("Average is : " + avg);

            // Determine grade
            if (avg >= 75) {
                grade = "Distinction";
            } else if (avg >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Overall Grade is : " + grade);
            System.out.println();

            studentCount++;
        }

        input.close();
    }
}

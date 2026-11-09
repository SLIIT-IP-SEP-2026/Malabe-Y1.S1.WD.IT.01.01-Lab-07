import java.util.Scanner;

public class IT26101970Lab7Q1B {

    public static void main(String[] args) {

        // Declaring variables
        int mark1, mark2, mark3, mark4;
        double avg;
        String grade;
        int studentCount = 1;

        // Getting the input from the user
        Scanner input = new Scanner (System.in);
        
        while (studentCount <= 3) {
            // Printing the Student number
            System.out.println("Student " + studentCount);
            
            // Increasing the count by 1
            studentCount += 1;

            System.out.print("Enter marks : ");
            mark1 = input.nextInt();
            mark2 = input.nextInt();
            mark3 = input.nextInt();
            mark4 = input.nextInt();

            // Calculating the average
            avg = (mark1 + mark2 + mark3 + mark4) / 4.0;

            // Calculating the grade
            if (avg >= 75) {
                grade = "Distinction";
            } else if (avg >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            // Displaying the average
            System.out.println("Average is : " + avg);
            System.out.println("Overall Grade is: " + grade);
            System.out.println();

        }
    }
}

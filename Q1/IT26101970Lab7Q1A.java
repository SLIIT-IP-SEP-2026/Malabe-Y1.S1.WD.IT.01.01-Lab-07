import java.util.Scanner;

public class IT26101970Lab7Q1A {

    public static void main(String[] args) {

        // Declaring variables
        int mark1, mark2, mark3, mark4;
        double avg;
        String grade;

        // Getting the input from the user
        Scanner input = new Scanner (System.in);

        System.out.println("Enter marks for four subjects: ");

        System.out.print("Enter Subject Mark 1: ");
        mark1 = input.nextInt();

        System.out.print("Enter Subject Mark 2: ");
        mark2 = input.nextInt();

        System.out.print("Enter Subject Mark 3: ");
        mark3 = input.nextInt();

        System.out.print("Enter Subject Mark 4: ");
        mark4 = input.nextInt();


        // Calculating the average
        avg = (mark1 + mark2 + mark3 + mark4) / 4.0;

        // Calculating the grade
        if (avg >= 75){
            grade = "Distinction";
        } else if (avg >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        // Displaying the average
        System.out.println();
        System.out.println("Average is : " + avg);
        System.out.println("Overall Grade is: " + grade);
    }
}

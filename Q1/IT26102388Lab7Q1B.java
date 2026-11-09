import java.util.Scanner;

public class IT26102388Lab7Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int SubjectMark1, SubjectMark2, SubjectMark3, SubjectMark4;
        double average;
        String grade;

        for (int student = 1; student <= 3; student++) {

            System.out.println("Student " + student);
            System.out.print("Enter marks: ");

            SubjectMark1 = input.nextInt();
            SubjectMark2 = input.nextInt();
            SubjectMark3 = input.nextInt();
            SubjectMark4 = input.nextInt();

            average = (SubjectMark1 + SubjectMark2 + SubjectMark3 + SubjectMark4) / 4.0;

            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Average is : " + average);
            System.out.println("Overall Grade is : " + grade);
            System.out.println();
        }

        input.close();
    }
}
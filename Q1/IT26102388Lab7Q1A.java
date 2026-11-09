import java.util.Scanner;

public class IT26102388Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int SubjectMark1, SubjectMark2, SubjectMark3, SubjectMark4;
        double average;
        String grade;

        System.out.println("Enter marks for four subjects:");

        System.out.print("Enter Subject Mark 1: ");
        SubjectMark1 = input.nextInt();

        System.out.print("Enter Subject Mark 2: ");
        SubjectMark2 = input.nextInt();

        System.out.print("Enter Subject Mark 3: ");
        SubjectMark3 = input.nextInt();

        System.out.print("Enter Subject Mark 4: ");
        SubjectMark4 = input.nextInt();

        average = (SubjectMark1 + SubjectMark2 + SubjectMark3 + SubjectMark4) / 4.0;

        if (average >= 75) {
            grade = "Distinction";
        } else if (average >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        System.out.println();
        System.out.println("Average is : " + average);
        System.out.println("Overall Grade is : " + grade);

        input.close();
    }
}
		  

   
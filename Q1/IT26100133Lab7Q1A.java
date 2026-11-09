import java.util.Scanner;

public class IT26100133Lab7Q1A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m1, m2, m3, m4;
        double avg;
        String grade;

        System.out.println("Enter marks for four subjects:");

        System.out.print("Enter Subject Mark 1: ");
        m1 = input.nextInt();

        System.out.print("Enter Subject Mark 2: ");
        m2 = input.nextInt();

        System.out.print("Enter Subject Mark 3: ");
        m3 = input.nextInt();

        System.out.print("Enter Subject Mark 4: ");
        m4 = input.nextInt();

        avg = (m1 + m2 + m3 + m4) / 4.0;

        if (avg >= 75) {
            grade = "Distinction";
        } else if (avg >= 50) {
            grade = "Credit";
        } else {
            grade = "Fail";
        }

        System.out.println("Average is: " + avg);
        System.out.println("Overall Grade is: " + grade);

    }
}
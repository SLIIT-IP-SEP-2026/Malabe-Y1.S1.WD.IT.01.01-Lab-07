
import java.util.Scanner;

public class IT26102353Lab7Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int mark1, mark2, mark3, mark4;
        double average;

        for (int i = 1; i <= 3; i++) {

            System.out.println("Student " + i);

            System.out.print("Enter marks for four subjects: ");

            mark1 = input.nextInt();
            mark2 = input.nextInt();
            mark3 = input.nextInt();
            mark4 = input.nextInt();

            average = (mark1 + mark2 + mark3 + mark4) / 4.0;

            System.out.println("Average = " + average);

            if (average >= 75) {
                System.out.println("Grade = Distinction");
            } 
            else if (average >= 50) {
                System.out.println("Grade = Credit");
            } 
            else {
                System.out.println("Grade = Fail");
            }

            System.out.println();
        }
    }
}

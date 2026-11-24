
import java.util.Scanner;

public class IT26102475Lab7Q1B {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int marks[] = new int[4];
        int total;
        double average;

        for (int student = 1; student <= 3; student++) {

            total = 0;

            System.out.println("Student " + student);

           System.out.print("Enter marks: ");

for (int i = 0; i < 4; i++) {

    marks[i] = input.nextInt();

    total = total + marks[i];

            }

            average = total / 4.0;

            System.out.println("Average is : " + average);

            if (average >= 75) {

                System.out.println("Overall Grade is : Distinction");

            }
            else if (average >= 50) {

                System.out.println("Overall Grade is : Credit");

            }
            else {

                System.out.println("Overall Grade is : Fail");

            }

            System.out.println();
        }

        input.close();
    }
}

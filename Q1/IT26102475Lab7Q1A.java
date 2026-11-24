
import java.util.Scanner;

public class IT26102475Lab7Q1A {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int marks[] = new int[4];
        int total = 0;
        double average;

        System.out.println("Enter the marks for four subjects");

        for (int i = 0; i < 4; i++) {

            System.out.println("Subject Mark " + (i + 1) + "=");

            marks[i] = input.nextInt();

            total = total + marks[i];
        }

        average = total / 4.0;

        System.out.println("Average is :" + average);

        if (average >= 75.0) {

            System.out.println("Overall grade is: Distinction");

        }
        else if (average >= 50.0) {

            System.out.println("Overall grade is: Credit");

        }
        else {

            System.out.println("Overall grade is: Fail");

        }

        input.close();
    }
}



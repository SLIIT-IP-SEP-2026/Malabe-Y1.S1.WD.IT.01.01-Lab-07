import java.util.Scanner;

public class IT26102434Lab7Q1B {

    public static void main(String[] args) {

      
        int studentCount;
        int mark1, mark2, mark3, mark4;
        double average;

        Scanner input = new Scanner(System.in);

       
        for (studentCount = 1; studentCount <= 3; studentCount++) {

            System.out.println("Student " + studentCount);
            System.out.print("Enter marks: ");

 
            mark1 = input.nextInt();
            mark2 = input.nextInt();
            mark3 = input.nextInt();
            mark4 = input.nextInt();

 
            average = (mark1 + mark2 + mark3 + mark4) / 4.0;

            System.out.println("Average is : " + average);

            if (average >= 75) {
                System.out.println("Overall Grade is : Distinction");
            } else if (average >= 50) {
                System.out.println("Overall Grade is : Credit");
            } else {
                System.out.println("Overall Grade is : Fail");
            }

            System.out.println();
        }
    }
}
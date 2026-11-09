import java.util.Scanner;

public class IT26102550Lab7Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 1; i <= 3; i++) {
            System.out.println("Student " + i);
            System.out.print("Enter marks: ");
            
            double m1 = scanner.nextDouble();
            double m2 = scanner.nextDouble();
            double m3 = scanner.nextDouble();
            double m4 = scanner.nextDouble();
            
            double average = (m1 + m2 + m3 + m4) / 4.0;
            System.out.println("Average is: " + average);
            
            if (average >= 75 && average <= 100) {
                System.out.println("Overall Grade is: Distinction");
            } else if (average >= 50 && average <= 74) {
                System.out.println("Overall Grade is: Credit");
            } else {
                System.out.println("Overall Grade is: Fail");
            }
        }
    }
}
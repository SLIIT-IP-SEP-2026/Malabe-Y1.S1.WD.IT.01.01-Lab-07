import java.util.Scanner;

public class IT26102459Lab7Q1B
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Outer loop for 3 students
        for (int i = 1; i <= 3; i++)
        {
            System.out.println("Student " + i);
            System.out.print("Enter marks: ");
            
            double total = 0;
            
            // Inner loop for 4 subjects
            for (int j = 1; j <= 4; j++)
            {
                double mark = input.nextDouble();
                total += mark;
            }
            
            double average = total / 4.0;
            System.out.println("Average is : " + average);
            
            if (average >= 75)
            {
                System.out.println("Overall Grade is : Distinction");
            }
            else if (average >= 50)
            {
                System.out.println("Overall Grade is : Credit");
            }
            else
            {
                System.out.println("Overall Grade is : Fail");
            }
            
            System.out.println(); // Blank line between students
        }
        
        
    }
}
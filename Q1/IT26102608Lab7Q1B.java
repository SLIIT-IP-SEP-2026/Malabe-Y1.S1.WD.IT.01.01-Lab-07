import java.util.Scanner;

public class IT26102608Lab7Q1B { 
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);
        
        int mark, sum;
        
        for (int i = 1; i < 4; i++) {
        
            sum = 0;
            double avg = 0;
            System.out.println("Student " + i);
            System.out.print("Enter 4 marks : ");
            
            for (int j = 0; j < 4; j++) {
                mark = input.nextInt();
                
                if (mark > 100 || mark < 0) {
                    System.out.println("\nSubject marks should be between 0 and 100! Try again.\n");
                    j--;
                    continue;
                }
                sum += mark;
            }
            
            avg = sum / 4.0; 
            System.out.println("Average is : " + avg);
            
            String grade;
            if (avg > 74) {
                grade = "Distinction";
            } else if (avg > 49) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }
        
            System.out.println("Overall Grade is : " + grade + "\n");
        }
        input.close();
    }
}
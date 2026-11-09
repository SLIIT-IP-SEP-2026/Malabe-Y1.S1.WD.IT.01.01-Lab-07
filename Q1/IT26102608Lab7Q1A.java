import java.util.Scanner;

public class IT26102608Lab7Q1A{

    public static void main(String[]args){
    
        Scanner input = new Scanner(System.in);
        
        String grade;
        int sum=0 ,mark;
        double avg;
        
        System.out.println("Enter marks for four subjects: ");
        
        for(int i=1; i<5; i++){
        
            System.out.print("Enter Subject Mark " + i + ": ");
            mark = input.nextInt();
            
            if (mark > 100 || mark < 0){
                
                System.out.println("Subject marks should be between 0 and 100!\n");
                i--;
                continue;
            }
            else{
            
                sum += mark;
            }
        }
        
        avg = sum/4;
        System.out.println("\nAverage is : " + avg);
        
        if (avg > 74){
            grade = "Distinction";
        }
        
        else if (avg > 49){
            grade = "Credit";
        }
        
        else{
            grade = "Fail";
        }
        
        System.out.println("Overall Grade is : " + grade);
    }
}
import java.util.Scanner;

public class IT26102376Lab7Q1B
{
   public static void main(String [] args)
   {
	   Scanner input = new Scanner(System.in);
	   int mark1 , mark2 , mark3 , mark4 ;
	   double avg ;
	   String grade ;
	   int studentCount = 1 ;
	   
	   while (studentCount <= 3)
	   {
           System.out.println("Student" + studentCount);
		   
		   System.out.println("Enter marks : ");
		   mark1 = input.nextInt();
		   mark2 = input.nextInt();
		   mark3 = input.nextInt();
		   mark4 = input.nextInt();
		   
	   
	   
       avg = (mark1 + mark2 + mark3 + mark4)/4.0 ;
	   System.out.print("Average is : " + avg);
	   
	   if (avg >= 75)
	   {
		   grade = "Distinction";
	   }
	   else if (avg >= 50)
	   {
		   grade = "Credit";
	   }
	   else
	   {
		   grade = "Faill";
	   }
	   
	   
	   System.out.println();
	   System.out.println ("Overall Grade is :" +grade);
	   System.out.println();
	   
	   studentCount++;
	   }
	   
   }
}
	   
		   
	   
	   
	   
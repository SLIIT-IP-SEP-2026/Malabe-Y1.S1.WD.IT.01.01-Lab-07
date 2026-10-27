import java.util.Scanner;

public class IT26102417Lab7Q1B{
   public static void main(String[]args){
	   
	   double m1,m2,m3,m4 ;
	   String grade;
	   
	   
	   
	   Scanner input = new Scanner(System.in); 
       
	    for(int count = 1 ; count <= 3; count++){
			
			System.out.println("student" + count);
			System.out.print("Enter marks :");
			
		    m1 = input.nextDouble();
		    m2 = input.nextDouble();	
		    m3 = input.nextDouble();
		    m4 = input.nextDouble();	
			
			double avg = (m1 + m2 + m3 + m4)/4;
			
		 if(avg >= 75){
		   grade =" Ditinction";
	   }
	   
	     else if(avg>=50){
		    grade = "credit";
	   }
	     else {
		   grade  = "fail";
	   }
	   
		System.out.println();
        System.out.println("average is :" + avg);
		 System.out.println("Overall grade is :" + grade);
			
	    System.out.println();
			
			
			
		}
		
		


  }
      

}
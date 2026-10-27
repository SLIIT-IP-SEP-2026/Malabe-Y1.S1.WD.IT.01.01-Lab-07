import java.util.Scanner;

public class IT26102417Lab7Q1A{
	 public static void main(String[]args){
		 
	  int mark1,mark2,mark3,mark4;
      double avg  ;
      String grade;



      Scanner input = new Scanner(System.in);
       
      System.out.print("Enter marks for  four subjects:");
 
	 
      System.out.println("Enter subject mark 1:");
	  mark1 = input.nextInt();	 
		 
	  
      System.out.print("Enter subject mark 2:");
	  mark2 = input.nextInt();	 	 
		 
	  
      System.out.print("Enter subject mark 3:");
	  mark3 = input.nextInt();	 
     
      
      System.out.print("Enter subject mark 4:");
	  mark4 = input.nextInt();	 	 
	

      avg = (mark1 + mark2 + mark3 + mark4)/4;


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
			
	
		   

	}
	  
	  
}
           
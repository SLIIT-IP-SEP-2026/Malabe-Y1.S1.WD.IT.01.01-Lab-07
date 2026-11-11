import java.util.Scanner;
public class IT26102367Lab7Q1B{
	public static void main(String[]args){
		int Mark1,Mark2,Mark3,Mark4;
		double Average;
		
		System.out.println("Student 1");
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter Marks: ");
		Mark1=input.nextInt();
		
		if(Mark1 < 0 || Mark1 > 100){
			System.out.println("Invalid Mark");	
			return;
		}
		
		Mark2=input.nextInt();
		
		if(Mark2 < 0 || Mark2 > 100){
			System.out.println("Invalid Mark");
			return;
		}
		
		Mark3=input.nextInt();
		
		if(Mark3 < 0 || Mark3 > 100){
			System.out.println("Invalid Mark");
			return;
		}
		
		Mark4=input.nextInt();
		
		if(Mark4 < 0 || Mark4 > 100){
			System.out.println("Invalid Mark");
			return;			
		}
		
		Average=(Mark1+Mark2+Mark3+Mark4)/4;
		
		System.out.println("Average is : "+Average);
		
		if (Average >= 0 && Average <= 49){
		    System.out.println("Overall Grade is : Fail");		
		}
		else if (Average >= 50 && Average <= 74){
		    System.out.println("Overall Grade is : Credit");	
		} 
		else if (Average >= 75 && Average <= 100){
		    System.out.println("Overall Grade is : Distinction");	
		}
		
		System.out.println();
		
		System.out.println("Student 2");
		
		Scanner input2= new Scanner(System.in);
		
		System.out.print("Enter Marks: ");
		Mark1=input2.nextInt();
		
		if(Mark1 < 0 || Mark1 > 100){
			System.out.println("Invalid Mark");	
			return;
		}
		
		Mark2=input2.nextInt();
		
		if(Mark2 < 0 || Mark2 > 100){
			System.out.println("Invalid Mark");
			return;
		}
		
		Mark3=input2.nextInt();
		
		if(Mark3 < 0 || Mark3 > 100){
			System.out.println("Invalid Mark");
			return;
		}
		
		Mark4=input2.nextInt();
		
		if(Mark4 < 0 || Mark4 > 100){
			System.out.println("Invalid Mark");
			return;			
		}
		
		Average=(Mark1+Mark2+Mark3+Mark4)/4;
		
		System.out.println("Average is : "+Average);
		
		if (Average >= 0 && Average <= 49){
		    System.out.println("Overall Grade is : Fail");		
		}
		else if (Average >= 50 && Average <= 74){
		    System.out.println("Overall Grade is : Credit");	
		} 
		else if (Average >= 75 && Average <= 100){
		    System.out.println("Overall Grade is : Distinction");	
		}
		
		System.out.println();
		
		System.out.println("Student 3");
		
		Scanner input3= new Scanner(System.in);
		
		System.out.print("Enter Marks: ");
		Mark1=input3.nextInt();
		
		if(Mark1 < 0 || Mark1 > 100){
			System.out.println("Invalid Mark");	
			return;
		}
		
		Mark2=input3.nextInt();
		
		if(Mark2 < 0 || Mark2 > 100){
			System.out.println("Invalid Mark");
			return;
		}
		
		Mark3=input3.nextInt();
		
		if(Mark3 < 0 || Mark3 > 100){
			System.out.println("Invalid Mark");
			return;
		}
		
		Mark4=input3.nextInt();
		
		if(Mark4 < 0 || Mark4 > 100){
			System.out.println("Invalid Mark");
			return;			
		}
		
		Average=(Mark1+Mark2+Mark3+Mark4)/4;
		
		System.out.println("Average is : "+Average);
		
		if (Average >= 0 && Average <= 49){
		    System.out.println("Overall Grade is : Fail");		
		}
		else if (Average >= 50 && Average <= 74){
		    System.out.println("Overall Grade is : Credit");	
		} 
		else if (Average >= 75 && Average <= 100){
		    System.out.println("Overall Grade is : Distinction");	
		}
	}
}
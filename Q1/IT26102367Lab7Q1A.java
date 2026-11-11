import java.util.Scanner;
public class IT26102367Lab7Q1A{
	public static void main(String[]args){
		int Mark1,Mark2,Mark3,Mark4;
		double Average;
		
		System.out.println("Enter marks for four subjects:");
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter subject Mark 1:");
		Mark1=input.nextInt();
		
		if(Mark1 < 0 || Mark1 > 100){
			System.out.println("Invalid Mark");	
			return;
		}
		
		System.out.print("Enter subject Mark 2:");
		Mark2=input.nextInt();
		
		if(Mark2 < 0 || Mark2 > 100){
			System.out.println("Invalid Mark");
			return;
		}
		
		System.out.print("Enter subject Mark 3:");
		Mark3=input.nextInt();
		
		if(Mark3 < 0 || Mark3 > 100){
			System.out.println("Invalid Mark");
			return;
		}
		
		System.out.print("Enter subject Mark 4:");
		Mark4=input.nextInt();
		
		if(Mark4 < 0 || Mark4 > 100){
			System.out.println("Invalid Mark");
			return;			
		}
		System.out.println();
		
		Average=(Mark1+Mark2+Mark3+Mark4)/4;
		
		System.out.println("Average is :"+Average);
		
		if (Average >= 0 && Average <= 49){
		    System.out.print("Overall Grade is : Fail");		
		}
		else if (Average >= 50 && Average <= 74){
		    System.out.print("Overall Grade is : Credit");	
		} 
		else if (Average >= 75 && Average <= 100){
		    System.out.print("Overall Grade is : Distinction");	
		}
	}
}
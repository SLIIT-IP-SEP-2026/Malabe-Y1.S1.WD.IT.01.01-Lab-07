import java.util.Scanner;
public class IT26102459Lab7Q1A
{
	public static void main(String[]args)
	{
		Scanner input=new Scanner(System.in);
		double mark;
		double total=0;
		double average;
		int i=1;
		
		
		System.out.println("Enter marks for four subjects :");
		
		for(i=1;i<=4;i++)
		{
			System.out.print("Enter the number "+i+": ");
			mark=input.nextDouble();
			total=total+mark;
			
		}
		average= total/4;
		System.out.println(" ");
        System.out.println("Average is :"+average);
        
        if(average>=75)
		System.out.println("Overall Grade is : Distinction");
        else if(average>=50)
		System.out.println("Overall Grade is : Credit");
        else
		System.out.println("Overall Grade is : Fail");		
	}
}
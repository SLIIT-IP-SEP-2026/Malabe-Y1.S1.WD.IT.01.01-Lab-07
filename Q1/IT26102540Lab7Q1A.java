import java.util.Scanner;
public class IT26102540Lab7Q1A
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double m1,m2,m3,m4;
		System.out.println("Enter marks for four subjects:");
		System.out.print("Enter subject Mark 1 :");
		m1 = input.nextDouble();
		System.out.print("Enter subject Mark 2 :");
		m2 = input.nextDouble();
		System.out.print("Enter subject Mark 3 :");
		m3 = input.nextDouble();
		System.out.print("Enter subject Mark 4 :");
		m4 = input.nextDouble();
		System.out.println("");
		double avg = (m1+m2+m3+m4)/4.0;
		System.out.println("Average is:"+avg);
		if(avg>=75.0&&avg<=100.0)
		{
			System.out.print("Overall grade is : Distinction");
			return;
		}
		if(avg>50.0&&avg<=74.0)
		{
		   System.out.print("Overall grade is : Credit");
		   return;
		}
		if(avg>=0.0&&avg<49.0)
		{
			System.out.print("Overall grade is : Fail");
			return;
		}


	}
}
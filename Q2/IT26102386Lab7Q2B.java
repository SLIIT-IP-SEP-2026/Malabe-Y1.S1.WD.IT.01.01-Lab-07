public class IT26102386Lab7Q2B
{
	public static void main(String[]args)
	{
		int i,j;
		for(i=1;i<=5;i++)
		{
			System.out.print(i+"_");
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
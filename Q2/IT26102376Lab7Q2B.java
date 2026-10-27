import java.util.Scanner;

public class IT26102376Lab7Q2B
{
   public static void main(String [] args)
   {
	   Scanner input = new Scanner(System.in);
	   
	   int rows = 5 ;
	   
	   for (int rowCount = 1 ; rowCount <= rows ; rowCount++)
	   {
		   System.out.print(rowCount +"-");
		   
		   for (int columnCount = 1 ; columnCount <= rowCount ; columnCount++)
		   {
			   System.out.print("*");
		   }
		   System.out.println();
	   }
   }
}
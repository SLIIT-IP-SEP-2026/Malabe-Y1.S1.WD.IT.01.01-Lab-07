import java.util.Scanner;

public class IT26102376Lab7Q2A
{
   public static void main(String [] args)
   {
	   int rows = 4 ;
	   int columns = 5 ;
	   int rowCount , columnCount ;
	   
	   for ( rowCount = 0 ; rowCount < rows  ; rowCount++)
	   {
		   for (columnCount = 0 ; columnCount < columns ; columnCount++)
		   {
			   System.out.print("$");
		   }
		   System.out.println();
	   }
   }
}
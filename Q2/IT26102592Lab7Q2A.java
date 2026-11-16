import java.util.Scanner;

public class IT26102592Lab7Q2A {

public static void main(String [] args) {
	int rows =4;
	int columns = 5;
	
	//loop through the rows
	//start with 0 ->0,1,2,3
	
	for(int rowscount = 0; rowscount < rows; rowscount++) {
		//loop through the column
		//start with 0 > 0,1,2,3,4
		
		for(int columncount = 0; columncount < columns; columncount++) {
			System.out.print("$");
		}
		System.out.println();
	}
 }
}

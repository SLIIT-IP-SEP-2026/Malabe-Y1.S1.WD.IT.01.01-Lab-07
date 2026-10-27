import java.util.Scanner;

public class IT26101216Lab7Q2A {
	
    public static void main(String[] args) {
		
        int rows = 4;
        int columns = 5;

        // Loop through the rows
        for (int rowcount = 0; rowcount < rows; rowcount++) {
			
            // Loop through the columns
			// start with 0 -> 0,1,2,3,4
            for (int columncount = 0; columncount < columns; columncount++) {
                System.out.print("$ ");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}
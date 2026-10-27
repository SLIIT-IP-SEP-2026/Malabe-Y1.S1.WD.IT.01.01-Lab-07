import java.util.Scanner;

public class IT26101216Lab7Q2C {
	
    public static void main(String[] args) {
		
        // Outer loop for the rows (starting from 5 down to 1)
        for (int i = 5; i >= 1; i--) {
			
            // Inner loop for printing the columns (printing digit 'i', 'i' times)
            for (int j = 1; j <= i; j++) {
				
                System.out.print(i);
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
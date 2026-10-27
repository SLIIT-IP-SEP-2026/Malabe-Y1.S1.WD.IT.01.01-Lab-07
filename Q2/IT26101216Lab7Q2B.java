import java.util.Scanner;

public class IT26101216Lab7Q2B {
    public static void main(String[] args) {
        int rows = 5;

        // Loop through each row from 1 to 5
        for (int i = 1; i <= rows; i++) {
			
            // Print the current row number and the separator
            System.out.print(i + " - ");
            
            // Print 'i' number of stars with a space
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            
            // Move to the next line after each row
            System.out.println();
        }
    }
}
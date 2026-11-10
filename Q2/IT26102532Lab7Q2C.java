public class IT26102532Lab7Q2C {
    public static void main(String[] args) {
        // Outer loop controls row numbers from 5 down to 1
        for (int rowCount = 5; rowCount >= 1; rowCount--) {
            // Inner loop prints the current rowCount number, rowCount times per row
            for (int columnCount = 1; columnCount <= rowCount; columnCount++) {
                System.out.print(rowCount);
            }
            // Move to the next line after completing each row
            System.out.println();
        }
    }
}
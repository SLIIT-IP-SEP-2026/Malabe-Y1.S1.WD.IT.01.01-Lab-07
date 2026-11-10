public class IT26102532Lab7Q2A {
    public static void main(String[] args) {
        // Outer loop handles the 4 rows
        for (int rowCount = 1; rowCount <= 4; rowCount++) {
            // Inner loop handles the 5 dollar signs per row
            for (int columnCount = 1; columnCount <= 5; columnCount++) {
                System.out.print("$ ");
            }
            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
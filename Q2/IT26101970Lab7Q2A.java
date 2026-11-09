public class IT26101970Lab7Q2A {

    public static void main(String[] args) {

    // Declaring the rows and columns
    int rows = 4;
    int columns = 5;

    // loop through the row
    // start with 0 --> 0,1,2,3,
    for(int rowCount = 0; rowCount < rows; rowCount++) {

        // loop through the column
        // start with 0 --> 0,1,2,3,4
        for (int columnCount = 0; columnCount < columns; columnCount++) {
            System.out.print("$ ");
        }
        System.out.println();
    }

    }
}

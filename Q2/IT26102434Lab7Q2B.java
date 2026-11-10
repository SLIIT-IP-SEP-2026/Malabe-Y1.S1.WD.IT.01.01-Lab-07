public class IT26102434Lab7Q2B {

    public static void main(String[] args) {

 
        int row = 5;

 
        for (int rowCount = 1; rowCount <= row; rowCount++) {

            System.out.print(rowCount + " - ");

   
            for (int columnCount = 1; columnCount <= rowCount; columnCount++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
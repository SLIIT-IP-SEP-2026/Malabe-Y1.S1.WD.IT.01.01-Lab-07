public class IT26102434Lab7Q2C {

    public static void main(String[] args) {

      
        int row = 5;

   
        for (int rowCount = 5; rowCount >= 1; rowCount--) {

     
            for (int columnCount = 1; columnCount <= rowCount; columnCount++) {
                System.out.print(rowCount);
            }

            System.out.println();
        }
    }
}
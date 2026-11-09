import java.util.Scanner; 
   public class IT26102388Lab7Q2C {

    public static void main(String[] args) {

        int rows = 5;

        for (int rowcount = rows; rowcount >= 1; rowcount--) {

            for (int columncount = 1; columncount <= rowcount; columncount++) {

                System.out.print(rowcount);
            }

            System.out.println();
        }
    }
}
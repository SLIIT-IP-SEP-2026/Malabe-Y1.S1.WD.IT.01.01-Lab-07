import java.util.Scanner;

public class IT26102388Lab7Q2B {

    public static void main(String[] args) {

        int rows = 5;

        for (int rowcount = 1; rowcount <= rows; rowcount++) {

            System.out.print(rowcount + " - ");

            for (int columncount = 1; columncount <= rowcount; columncount++) {

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
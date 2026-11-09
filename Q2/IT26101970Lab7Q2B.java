public class IT26101970Lab7Q2B {

    public static void main(String[] args) {

        // Declaring variables
        String star = "*";
        int i, j;

        for (i = 1; i <= 5; i ++){
            System.out.print(i + " - ");
            for(j = 1; j <= i; j++) {
                System.out.print(star);

            }
            System.out.print("\n");
        }

    }
}

public class IT26102475Lab7Q2C {

    public static void main(String[] args) {

        int numbers[] = {5, 4, 3, 2, 1};

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < numbers[i]; j++) {
                System.out.print(numbers[i]);
            }

            System.out.println();
        }
    }
}
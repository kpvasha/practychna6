public class pract64 {
    public static void main(String[] args) {
        System.out.println("Таблиця синусів від 0 до 90 градусів:");

        int counter = 0;
        for (int i = 0; i <= 90; i++) {
            System.out.printf("%.2f ", Math.sin(Math.toRadians(i)));

            counter++;
            if (counter == 10) {
                System.out.println();
                counter = 0;
            }
        }
    }
}
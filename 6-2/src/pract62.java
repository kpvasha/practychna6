import java.util.Scanner;

public class pract62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть кількість кутів багатокутника: ");
        int n = scanner.nextInt();

        int[] angles = new int[n];
        int sum = 0;

        System.out.println("Введіть кути багатокутника:");
        for (int i = 0; i < n; i++) {
            angles[i] = scanner.nextInt();
            sum += angles[i];
        }

        int expectedSum = 180 * (n - 2);
        if (sum == expectedSum) {
            System.out.println("Багатокутник можливий.");
        } else {
            System.out.println("Багатокутник неможливий.");
        }
    }
}
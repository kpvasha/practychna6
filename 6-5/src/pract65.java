import java.util.Scanner;

public class pract65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        System.out.println("Масив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Перевіряти на зростання (1) чи спадання (2): ");
        int choice = scanner.nextInt();

        boolean isValid = true;
        if (choice == 1) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    isValid = false;
                    break;
                }
            }
        } else if (choice == 2) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    isValid = false;
                    break;
                }
            }
        }

        if (isValid) {
            System.out.println("Масив відповідає вибраному порядку.");
        } else {
            System.out.println("Масив не відповідає вибраному порядку.");
        }
    }
}
import java.util.Scanner;

public class pract63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100); // Випадкові числа 0-99
        }

        System.out.println("Початковий масив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.print("Введіть значення для пошуку: ");
        int oldValue = scanner.nextInt();
        System.out.print("Введіть нове значення: ");
        int newValue = scanner.nextInt();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }
        }

        System.out.println("Оновлений масив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
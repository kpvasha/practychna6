import java.util.Random;

public class pract6 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random random = new Random();

        int evenCount = 0, oddCount = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            if (array[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Масив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\nКількість парних: " + evenCount);
        System.out.println("Кількість непарних: " + oddCount);
    }
}
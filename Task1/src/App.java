import java.util.Scanner;

// Была создана программа, где запрашивается сначала число, имя и затем массив чисел
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Проверка числа
        System.out.print("Введите число: ");
        int number = scanner.nextInt();
        if (number > 7) {
            System.out.println("Привет");
        }

        // Проверка имени
        System.out.print("Введите имя: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        if (name.equals("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }

        // Числовой массив
        System.out.println("Введите элементы числового массива через пробел: ");
        String[] input = scanner.nextLine().split(" ");
        int[] array = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            array[i] = Integer.parseInt(input[i]);
        }

        System.out.println("Элементы массива, кратные 3:");
        for (int value : array) {
            if (value % 3 == 0) {
                System.out.print(value + " ");
            }
        }
    }
}
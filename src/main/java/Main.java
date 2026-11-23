import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Phone> phones = new ArrayList<>();

        // 3 об'єкти задаються в коді
        phones.add(new Phone("Apple", "iPhone 15", 899.99, 128));
        phones.add(new Phone("Samsung", "Galaxy S24", 799.0, 256));
        phones.add(new Phone("Xiaomi", "Redmi Note 13", 249.5, 128));

        // 2 об'єкти вводяться з клавіатури
        for (int i = 4; i <= 5; i++) {
            System.out.println("Введіть дані телефону №" + i + ":");

            String brand = readNonEmpty(scanner, "Бренд: ");
            String model = readNonEmpty(scanner, "Модель: ");
            double price = readDouble(scanner, "Ціна: ");
            int memory = readInt(scanner, "Пам'ять (ГБ): ");

            phones.add(new Phone(brand, model, price, memory));
        }

        System.out.println("\n=== Список телефонів ===");
        for (Phone phone : phones) {
            System.out.println(phone);
        }

        // демонстрація equals()
        System.out.println("\nПерший == другий: " + phones.get(0).equals(phones.get(1)));

        scanner.close();
    }

    private static String readNonEmpty(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            String s = scanner.nextLine().trim();
            if (!s.isEmpty()) {
                return s;
            }
            System.out.println("Помилка: поле не може бути порожнім.");
        }
    }

    private static int readInt(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            try {
                int value = Integer.parseInt(scanner.nextLine().trim());
                if (value > 0) {
                    return value;
                }
                System.out.println("Помилка: число має бути більшим за 0.");
            } catch (NumberFormatException e) {
                System.out.println("Помилка: введіть ціле число.");
            }
        }
    }

    private static double readDouble(Scanner scanner, String message) {
        while (true) {
            System.out.print(message);
            try {
                double value = Double.parseDouble(scanner.nextLine().trim().replace(',', '.'));
                if (value > 0) {
                    return value;
                }
                System.out.println("Помилка: число має бути більшим за 0.");
            } catch (NumberFormatException e) {
                System.out.println("Помилка: введіть число (наприклад, 499.99).");
            }
        }
    }
}
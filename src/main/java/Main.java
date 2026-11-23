import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList<>();

        phones.add(new Phone("Apple", "iPhone 15", 899.99, 128));
        phones.add(new Phone("Samsung", "Galaxy S24", 799.0, 256));
        phones.add(new Phone("Xiaomi", "Redmi Note 13", 249.5, 128));
        phones.add(new Phone("Google", "Pixel 8", 699.0, 128));
        phones.add(new Phone("OnePlus", "12", 749.0, 256));

        System.out.println("=== Список телефонів ===");
        for (Phone phone : phones) {
            System.out.println(phone);
        }
    }
}
import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        Product p1 = new Product(1, "Laptop", 10000, "Electronic");
        Product p2 = new Product(2, "Laptop", 10000, "Electronic");
        Product p3 = new Product(3, "Keyboard", 1300, "Components");

        System.out.println(p1);
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));

        Order o1 = new Order("Arkadiy", new Product[]{p1, p3});
        Order o2 = new Order("Arkadiy", new Product[]{p1, p3});
        Order o3 = new Order("Sasha", new Product[]{p2, p3});

        System.out.println(o1);
        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));

    }
}
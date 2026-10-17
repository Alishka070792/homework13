import java.util.Arrays;
import java.util.Objects;

public class Order {
    String customer;
    Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;

    }

    @Override
    public String toString() {
        return "Заказ [клиент = " + customer + ", корзина = " + Arrays.toString(basket) + "] ";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Order other = (Order) obj;
        if (!Objects.equals(customer, other.customer)) return false;
        if (basket.length != other.basket.length) return false;
        for (int i = 0; i < basket.length; i++) {
            if (basket[i] == null) {
                if (other.basket[i] != null) return false;
            } else if (!basket[i].equals(other.basket[i])) {
                return false;
            }

        }
        return true;
    }

}


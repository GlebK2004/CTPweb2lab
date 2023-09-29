package Medicine.Pharmacy;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class Order {
    private int orderId;
    private String customerName;
    private List<Medicine> medicines;

    public Order(int orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.medicines = new ArrayList<>();
    }

    public int getOrderId() {
        return orderId;
    }

    // Другие геттеры и сеттеры

    // Метод для добавления лекарств в заказ
    public void addMedicine(Medicine medicine) {
        medicines.add(medicine);
    }

    // Другие методы

    @Override
    public String toString() {
        return "Заказ #" + orderId + "\n" + medicines.get(0) + " для " + customerName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Order order = (Order) obj;
        return orderId == order.orderId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId);
    }
}
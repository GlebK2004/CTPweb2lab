package Medicine.Pharmacy;

import java.util.ArrayList;
import java.util.List;
public class LocalPharmacy extends Pharmacy implements PharmacyEmployee
{
    private List<Order> orders;

    public LocalPharmacy(String name, String address) {
        super(name, address);
        orders = new ArrayList<>();
    }

    @Override
    public void processOrder(Order order) {
        // Логика обработки заказа для местной аптеки
        orders.add(order);
        System.out.println("Заказ #" + order.getOrderId() + " обработан " + name);
    }

    @Override
    public void placeOrder(Order order) {
        // Логика размещения заказа для местной аптеки
        processOrder(order);
    }
}
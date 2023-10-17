package Medicine.Pharmacy;

import java.util.List;
import java.util.ArrayList;
    public class OnlinePharmacy extends Pharmacy implements PharmacyEmployee
    {
        private List<Order> orders;

        public OnlinePharmacy(String name, String address) {
            super(name, address);
            orders = new ArrayList<>();
            orders.я
        }

        @Override
        public void processOrder(Order order) {
            // Логика обработки заказа для онлайн аптеки
            orders.add(order);
            System.out.println("Заказ #" + order.getOrderId() + " обработан " + name);
        }

        @Override
        public void placeOrder(Order order) {
            // Логика размещения заказа для онлайн аптеки
            processOrder(order);
        }
    }

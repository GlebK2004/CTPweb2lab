package Medicine.Pharmacy;

import Medicine.Pharmacy.Medicine;
import Medicine.Pharmacy.Pharmacy;
import Medicine.Pharmacy.LocalPharmacy;
import Medicine.Pharmacy.OnlinePharmacy;

public class Main
{
    public static void main(String[] args)
    {
        // Создаем несколько аптек
        Pharmacy onlinePharmacy = new OnlinePharmacy("Альфа Аптека", "Кедышко 4");
        Pharmacy localPharmacy = new LocalPharmacy("Остров здоровья", "Притыцкого 89");

        // Создаем лекарства
        Medicine medicine1 = new Medicine("Аспирин", 5.99);
        Medicine medicine2 = new Medicine("Ибупрофен", 7.99);
        Medicine medicine3 = new Medicine("Активированный уголь", 4.99);

        // Создаем заказы
        Order order1 = new Order(1, "Антон Забаев");
        order1.addMedicine(medicine1);
        order1.addMedicine(medicine2);

        Order order2 = new Order(2, "Сергей Стариков");
        order2.addMedicine(medicine2);
        order2.addMedicine(medicine3);

        // Выводим информацию о лекарствах и аптеках
        System.out.println("\nАптеки:");
        System.out.println(onlinePharmacy);
        System.out.println(localPharmacy);

        System.out.println("\nЛекарства:");
        System.out.println(medicine1);
        System.out.println(medicine2);
        System.out.println(medicine3);

        // Размещаем заказы в аптеках
        System.out.print("\n");
        onlinePharmacy.placeOrder(order1);
        localPharmacy.placeOrder(order2);

        System.out.println("\nЗаказы:");
        System.out.println(order1);
        System.out.println(order2);

        System.out.println("Hello, World");
        System.out.println("Hello, World2");
        System.out.println("Hello, World3");
        System.out.println("Hello, World4");
    }
}
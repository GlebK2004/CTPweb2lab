package Medicine.Pharmacy;

import java.util.Objects;
public class Medicine
{
    private String name;
    private double price;

    // Конструктор, геттеры и сеттеры
    public Medicine(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - $" + price;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Medicine medicine = (Medicine) obj;
        return name.equals(medicine.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name);
    }
}
package Medicine.Pharmacy;

import java.util.Objects;
public abstract class Pharmacy
{
    protected String name;
    protected String address;

    public Pharmacy(String name, String address)
    {
        this.name = name;
        this.address = address;
    }

    public abstract void placeOrder(Order order);

    @Override
    public String toString()
    {
        return name + " (" + address + ")";
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) obj;
        return name.equals(pharmacy.name) && address.equals(pharmacy.address);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, address);
    }
}
package Loc.File;

import java.io.Serializable;

public class BinaryProduct implements Serializable {
    String id;
    String name;
    transient String brand;
    double price;

    public BinaryProduct(String id, String name, String brand, double price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "BinaryProduct{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}

package KocchiWoMiro;

import java.io.Serializable;

public class Product implements Serializable {
    public int id;
    public String title;
    public String description;
    public double volume;
    public int price;
    public boolean isInStock;

    public Product(int id, String title, String description, double volume, int price, boolean isInStock) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.volume = volume;
        this.price = price;
        this.isInStock = isInStock;
    }
}

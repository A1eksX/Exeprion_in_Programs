package HomeWork.HomeWork3;

public class Product {
    private String name;
    private int availableQuantity;
    private double price;
    private int id;

    public Product(String name, int availableQuantity, double price, int id) {
        this.name = name;
        this.availableQuantity = availableQuantity;
        this.price = price;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }
}

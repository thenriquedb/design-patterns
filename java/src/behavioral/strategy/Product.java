package behavioral.strategy;

public class Product {
    private String name;
    private float price;

    public Product(String name, float price) {
        setName(name);
        setPrice(price);
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

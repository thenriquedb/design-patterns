package creational.builder;

public class Product {
    private String name;
    private Float price;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getPrice() {
        return price;
    }
}

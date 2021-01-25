package structural.decorator;

public class TShirt implements Product {
    private String name = "TShirt";
    private double price = 25.99;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }
}

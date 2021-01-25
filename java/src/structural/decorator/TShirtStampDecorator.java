package structural.decorator;

public class TShirtStampDecorator {
    Product product;

    public TShirtStampDecorator(Product product) {
        this.product = product;
    }

    public String getName() {
        return "Stamped " + product.getName() ;
    }

    public String getPrice() {
        return "R$ " + (product.getPrice() + 10);
    }
}



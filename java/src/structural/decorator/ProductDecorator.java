package structural.decorator;

public class ProductDecorator {
    Product product;

    public ProductDecorator(Product product) {
        this.product = product;
    }

    public String getName() {
        return product.getName();
    }

    public String getPrice() {
        return "R$ " + product.getPrice();
    }
}

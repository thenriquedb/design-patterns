package behavioral.strategy;


import java.util.ArrayList;
import java.util.List;

public class Cart {
    private ArrayList<Product> products;
    protected DiscountStrategy discountStrategy = new DefaultDiscount(this);

    public void addProduct(Product product) {
        if(this.products == null) {
            this.products = new ArrayList<Product>();
        }

        this.products.add(product);
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }


    public float getTotal() {
        float total = 0;

        for(Product product: products) {
            total = total + product.getPrice();
        }

        return total;
    }

    public float getTotalWithDiscount() {
        float total = 0;

        for(Product product: products) {
            total = total + product.getPrice();
        }

        return this.discountStrategy.calculateDiscount();
    }
}

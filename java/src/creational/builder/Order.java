package creational.builder;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private Customer customer;
    private Seller seller;

    private ArrayList<Product> products;

    public Float getTotal() {
        Float total = 0f;
        for (Product product : products) {
            total = total +product.getPrice();
        }

        return total;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void addProduct(Product product) {
        if(this.products == null) {
            this.products = new ArrayList<Product>();
        }

        this.products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Seller getSeller() {
        return seller;
    }
}

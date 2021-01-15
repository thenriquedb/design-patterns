package creational.builder;

public class OrderBuilder {
    private Order instance;

    public OrderBuilder() {
        this.instance = new Order();
    }

    public OrderBuilder setOrder(int id) {
        this.instance.setId(id);
        return  this;
    }

    public OrderBuilder setClient(int id, String name, String phone) {
        Customer customer = new Customer();
        customer.setId(id);
        customer.setName(name);
        customer.setPhone(phone);

        this.instance.setCustomer(customer);

        return this;
    }

    public OrderBuilder setSeller(int id, String name) {
        Seller seller = new Seller();
        seller.setId(id);
        seller.setName(name);

        this.instance.setSeller(seller);

        return this;
    }

    public OrderBuilder setProduct(String name, Float price) {
        Product product = new Product();
        product.setName("Sofá");
        product.setPrice(799.90f);

        this.instance.addProduct(product);

        return this;
    }

    public Order builder() {
        return instance;
    }
}


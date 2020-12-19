package builder;

public class Main {
    public void withoutBuilder() {
        Customer customer = new Customer();
        customer.setName("Carlos");
        customer.setId(1);
        customer.setPhone("999999999");

        Seller seller = new Seller();
        seller.setName("Rodrigo");
        seller.setId(1);

        Product product1 = new Product();
        product1.setName("Televisão 4k");
        product1.setPrice(2199.90f);

        Product product2 = new Product();
        product2.setName("Sofá");
        product2.setPrice(799.90f);

        Order order = new Order();
        order.setCustomer(customer);
        order.setSeller(seller);
        order.setId(1);
        order.addProduct(product1);
        order.addProduct(product2);
    }

    public static void main(String[] args) {
        Order order = new OrderBuilder()
            .setClient(1,"Carlos","123456789")
            .setSeller(1,"João")
            .setProduct("Geladeira",2199.90f)
            .setProduct("Armário",499.90f)
            .setOrder(1)
            .builder();

        System.out.println("Total: " + order.getTotal());
    }
}

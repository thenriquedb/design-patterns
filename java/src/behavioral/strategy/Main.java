package behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Product product01 = new Product("Product 01",100);
        Product product02 = new Product("Product 02",150);
        Product product03 = new Product("Product 03",150);
        Product product04 = new Product("Product 03",500);

        Cart cart = new Cart();
        cart.addProduct(product01);
        cart.addProduct(product02);
        cart.addProduct(product03);
        cart.addProduct(product04);

        DiscountStrategy defaultDefault = new DefaultDiscount(cart);
        DiscountStrategy newDiscount = new NewDiscount(cart);
        cart.setDiscountStrategy(newDiscount);

        System.out.println("Total: " + cart.getTotal());
        System.out.println("Total with discount: " + cart.getTotalWithDiscount());
    }
}

package behavioral.visitor;

import behavioral.visitor.visitors.TaxVisitor;

import java.util.ArrayList;

public class Cart {
    ArrayList<Product> products = new ArrayList<Product>();
    TaxVisitor taxVisitor;

    public  Cart(TaxVisitor taxVisitor) {
        this.taxVisitor = taxVisitor;
    }

    public void setTaxVisitor(TaxVisitor taxVisitor) {
        this.taxVisitor = taxVisitor;
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public Float getTotal() {
        Float total = 0F;

        for (Product product: products) {
            total = product.getPrice();
        }

        return total;
    }

    public Float getTotalWithTaxes() {
        Float total = 0F;

        for (Product product: products) {
            total = product.getPriceWithTaxes(taxVisitor);
        }

        return total;
    }
}

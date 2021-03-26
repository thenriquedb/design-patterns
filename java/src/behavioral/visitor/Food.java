package behavioral.visitor;

import behavioral.visitor.visitors.TaxVisitor;

public class Food implements Product {
    private String name;
    private Float price;

    public Food(String name, Float price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Float getPrice() {
        return price;
    }

    @Override
    public Float getPriceWithTaxes(TaxVisitor taxVisitor) {
        return taxVisitor.calculateTaxesForFood(this);
    }
}

package behavioral.visitor;

import behavioral.visitor.visitors.TaxVisitor;

public class Cigarette implements Product {
    private String name;
    private Float price;

    public Cigarette(String name, Float price) {
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
        return taxVisitor.calculateTaxesCigarette(this);
    }
}

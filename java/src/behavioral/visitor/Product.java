package behavioral.visitor;

import behavioral.visitor.visitors.TaxVisitor;

public interface Product {
    String getName();
    Float getPrice();
    Float getPriceWithTaxes(TaxVisitor taxVisitor);
}

package behavioral.visitor;

import behavioral.visitor.visitors.BrazilTaxVisitor;
import behavioral.visitor.visitors.GermanyTaxVisitor;
import behavioral.visitor.visitors.TaxVisitor;

public class Main {
    public static void main(String[] args) {
        Food food = new Food("Food", 50F);
        Cigarette cigarette = new Cigarette("Cigarrete",10F);
        AlcoholicDrink alcoholicDrink = new AlcoholicDrink("Beer",150F);


        TaxVisitor brazilTaxVisitor = new BrazilTaxVisitor();

        Cart cart = new Cart(brazilTaxVisitor);

        cart.addProduct(food);
        cart.addProduct(cigarette);
        cart.addProduct(alcoholicDrink);

        System.out.println("Total Brazil: " + cart.getTotal());
        System.out.println("Total Brazil with taxes: " + cart.getTotalWithTaxes());

        TaxVisitor germanyTaxVisitor = new GermanyTaxVisitor();
        cart.setTaxVisitor(germanyTaxVisitor);
        System.out.println("Total Germany: " + cart.getTotal());
        System.out.println("Total Germany with taxes: " + cart.getTotalWithTaxes());

    }
}

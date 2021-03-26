package behavioral.visitor.visitors;

import behavioral.visitor.AlcoholicDrink;
import behavioral.visitor.Cigarette;
import behavioral.visitor.Food;

public class BrazilTaxVisitor implements TaxVisitor{
    @Override
    public float calculateTaxesForFood(Food food) {
        return food.getPrice() * 1.1F;
    }

    @Override
    public float calculateTaxesCigarette(Cigarette cigarette) {
        return cigarette.getPrice() * 1.6F;
    }

    @Override
    public float calculateTaxesForAlcoholicDrink(AlcoholicDrink alcoholicDrink) {
        return alcoholicDrink.getPrice() * 1.4F;
    }
}

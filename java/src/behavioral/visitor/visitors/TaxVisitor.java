package behavioral.visitor.visitors;

import behavioral.visitor.AlcoholicDrink;
import behavioral.visitor.Cigarette;
import behavioral.visitor.Food;

public interface TaxVisitor {
    float calculateTaxesForFood(Food food);
    float calculateTaxesCigarette(Cigarette cigarette);
    float calculateTaxesForAlcoholicDrink(AlcoholicDrink alcoholicDrink);
}

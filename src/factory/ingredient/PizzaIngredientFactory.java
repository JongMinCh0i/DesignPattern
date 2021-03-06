package factory.ingredient;

import factory.ingredient.cheese.Cheese;
import factory.ingredient.clams.Clams;
import factory.ingredient.dough.Dough;
import factory.ingredient.sauce.Sauce;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Clams createClam();
}

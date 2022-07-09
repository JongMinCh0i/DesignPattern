package factory;

import factory.pizzatype.Pizza;
import factory.pizzatype.chicagostyle.ChicagoStyleCheesePizza;
import factory.pizzatype.chicagostyle.ChicagoStyleClamPizza;
import factory.pizzatype.chicagostyle.ChicagoStylePepperoniPizza;
import factory.pizzatype.chicagostyle.ChicagoStyleVeggiePizza;
import factory.pizzatype.nystyle.NYStyleCheesePizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String item) {
        if(item.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }else if(item.equals("pepperoni")){
            return new ChicagoStylePepperoniPizza();
        }else if(item.equals("clam")){
            return new ChicagoStyleClamPizza();
        }else if(item.equals("veggie")){
            return new ChicagoStyleVeggiePizza();
        }
        return null;
    }
}
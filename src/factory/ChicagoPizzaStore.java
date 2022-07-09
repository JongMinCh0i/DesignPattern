package factory;

import factory.pizzatype.Pizza;
import factory.pizzatype.chicagostyle.ChicagoStyleCheesePizza;
import factory.pizzatype.nystyle.NYStyleCheesePizza;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String item) {
        if(item.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        }else if(item.equals("pepperoni")){

        }else if(item.equals("clam")){

        }else if(item.equals("veggie")){

        }
        return null;
    }
}
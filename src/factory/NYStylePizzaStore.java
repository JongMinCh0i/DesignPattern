//package factory;
//
//import factory.PizzaStore;
//import factory.pizzatype.Pizza;
//import factory.pizzatype.nystyle.NYStyleCheesePizza;
//import factory.pizzatype.nystyle.NYStyleClamPizza;
//import factory.pizzatype.nystyle.NYStylePepperoniPizza;
//import factory.pizzatype.nystyle.NYStyleVeggiePizza;
//
//public class NYStylePizzaStore extends PizzaStore {
//    @Override
//    Pizza createPizza(String item) {
//        if(item.equals("cheese")){
//            return new NYStyleCheesePizza();
//        }else if(item.equals("pepperoni")){
//            return new NYStylePepperoniPizza();
//        }else if(item.equals("clam")){
//            return new NYStyleClamPizza();
//        }else if(item.equals("veggie")){
//            return new NYStyleVeggiePizza();
//        }
//        return null;
//    }
//}

package factory.test;

import factory.ChicagoPizzaStore;
import factory.NYStylePizzaStore;
import factory.PizzaStore;
import factory.pizzatype.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYStylePizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("에단이 주문한" + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("조엘이 주문한" + pizza.getName() + "\n");
    }
}

package factory.pizzatype;

import factory.ingredient.cheese.Cheese;
import factory.ingredient.clams.Clams;
import factory.ingredient.dough.Dough;
import factory.ingredient.sauce.Sauce;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    public void setName(String name) {
        this.name = name;
    }

    String name;

    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Clams clam;

    protected List<String> toppings = new ArrayList<>();

    public abstract void prepare();

    public void bake(){
        System.out.println("175도에서 25분 간 굽기");
    }
    public void cut(){
        System.out.println("피자를 사선으로 자르기");
    }
    public void box(){
        System.out.println("상자에 피자 담기");
    }

    public String getName() {
        return name;
    }


}

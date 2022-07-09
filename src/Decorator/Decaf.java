package Decorator;

public class Decaf extends Beverage{

    public Decaf() {
        description = "디 카페인 커피";
    }

    @Override
    public double cost() {
        return 1.05;
    }
}

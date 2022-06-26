package Strategy;

import Strategy.Behavior.Fly.FlyNoWay;
import Strategy.Behavior.Quack.Quack;

public class ModelDuck extends Duck {


    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("저는 모형 오리입니다");
    }
}
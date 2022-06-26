package Strategy;

import Strategy.Behavior.Fly.FlyWithWings;
import Strategy.Behavior.Quack.Quack;

public class MallardDuck extends Duck {

    // 생성시점
    public MallardDuck() {

        // MallardDuck이 꽥꽥거리는 행동을 처리할 때는 Quack 클래스를 사용하므로
        // performQuack()이 호출되면 꽥꽥 거리는 행동은 Quack 객체에게 위임된다.
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("저는 물 오리입니다");
    }
}

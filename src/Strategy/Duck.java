package Strategy;

import Strategy.Behavior.Fly.FlyBehavior;
import Strategy.Behavior.Quack.QuackBehavior;

public abstract class Duck {
    // 행동 인터페이스 형식의 레퍼런스 변수 2개를 선언합니다.
    // 같은 패키지에 속하는 모든 서브클래스에서 이 변수를 상속합니다.

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public abstract void display();

    // 행동 클래스에 위임합니다.
    public void performFly() {
        flyBehavior.fly();
    }

    // 행동 클래스에 위임합니다.
    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("모든 오리는 물에 뜹니다. 까짜 오리도 뜨죠");
    }

    // setter 를 통한 동적 할당
    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}
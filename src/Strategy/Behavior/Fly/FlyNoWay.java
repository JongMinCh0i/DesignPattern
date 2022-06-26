package Strategy.Behavior.Fly;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("날고 있어요!!");
    }
}

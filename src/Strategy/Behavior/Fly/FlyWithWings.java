package Strategy.Behavior.Fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("저는 못 날아요");
    }
}

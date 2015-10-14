package behavioral.patterns.strategy.headfirst;

public class FakeQuack implements QuackBehavior {
    public void quack() {
        System.out.println("Qwak");
    }
}

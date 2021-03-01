package behavioral.state;

import behavioral.state.bird.behaviors.BirdBehavior;
import behavioral.state.bird.behaviors.NotFly;
import behavioral.state.bird.behaviors.NotQuack;

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();

        duck.fly();
        duck.quack();

        BirdBehavior notQuack = new NotQuack();
        duck.setQuack(notQuack);

        BirdBehavior notFly = new NotFly();
        duck.setFly(notFly);

        duck.quack();
        duck.fly();
    }
}

package behavioral.state;

import behavioral.state.bird.behaviors.BirdBehavior;
import behavioral.state.bird.behaviors.Fly;
import behavioral.state.bird.behaviors.Quack;

public class Duck {
    private BirdBehavior fly;
    private BirdBehavior quack;

    public Duck() {
        this.fly = new Fly();
        this.quack = new Quack();
    }

    public void setFly(BirdBehavior fly) {
        this.fly = fly;
    }

    public void setQuack(BirdBehavior quack) {
        this.quack = quack;
    }

    public void fly() {
        this.fly.exec();
    }

    public void quack() {
        this.quack.exec();
    }
}

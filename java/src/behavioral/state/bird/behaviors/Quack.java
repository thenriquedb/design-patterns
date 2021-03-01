package behavioral.state.bird.behaviors;

public class Quack implements BirdBehavior {
    @Override
    public void exec() {
        System.out.println("Bird say quack!");
    }
}

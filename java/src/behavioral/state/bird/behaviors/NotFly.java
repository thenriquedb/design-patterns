package behavioral.state.bird.behaviors;

public class NotFly implements BirdBehavior {
    @Override
    public void exec() {
        System.out.println("Bird not fly.");
    }
}

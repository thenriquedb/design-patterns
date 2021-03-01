package behavioral.state.behaviors;

public class Fly implements BirdBehavior {
    @Override
    public void exec() {
        System.out.println("Bird flying!");
    }
}

package behavioral.state.behaviors;

public class NotQuack implements BirdBehavior {
    @Override
    public void exec() {
        System.out.println("Bird is silent...");
    }
}

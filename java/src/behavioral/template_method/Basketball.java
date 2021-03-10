package behavioral.template_method;

public class Basketball extends Game{

    @Override
    public void initialize() {
        System.out.println("5 players");
    }

    @Override
    public void startPlay() {
        System.out.println("Start a basketball game.");
    }

    @Override
    public void endPlay() {
        System.out.println("End a basketball game.");
    }
}

package behavioral.template_method;

public class Football extends Game{

    @Override
    public void initialize() {
        System.out.println("11 players");
    }

    @Override
    public void startPlay() {
        System.out.println("Start a football game.");
    }

    @Override
    public void endPlay() {
        System.out.println("End a football game.");
    }
}

package behavioral.observer;
import java.util.Observable;

class StolenCar extends Observable implements Car {
    private String action;

    public void forward() {
        this.action = "forward";
        System.out.println("Stolen car move on");
        this.changeState();
    }

    public void right() {
        this.action = "right";
        System.out.println("Stolen car turns right");
        this.changeState();
    }

    public void left() {
        this.action = "left";
        System.out.println("Stolen car turns left");
        this.changeState();
    }

    public void stop() {
        this.action = "stop";
        System.out.println("Stop stolen car");
        this.changeState();
    }

    public void changeState() {
        this.setChanged();
        this.notifyObservers(this.action);
    }
}
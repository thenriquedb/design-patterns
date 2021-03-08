package behavioral.observer;
import java.util.Observer;
import java.util.Observable;

class PoliceCar implements Observer, Car {
    private String action;

    public void forward() {
        this.action = "forward";
        System.out.println("Police car move on");
    }

    public void right() {
        this.action = "right";
        System.out.println("Police car turns right");
    }

    public void left() {
        this.action = "left";
        System.out.println("Police car turns left");
    }

    public void stop() {
        this.action = "stop";
        System.out.println("Stop Police car");
    }

    public void update(Observable arg0, Object arg1) {
        StolenCar observerCar = (StolenCar)arg0;
        String action = String.valueOf(arg1);

        if (action.equals("forward")) {
            this.forward();
        } else if (action.equals("right")) {
            this.right();
        } else if (action.equals("left")) {
            this.left();
        } else if (action.equals("stop")) {
            this.stop();
        }
    }
}
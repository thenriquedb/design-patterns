package behavioral.observer;

class Main {
    public static void main(String args[]) {
        PoliceCar policeCar = new PoliceCar();

        StolenCar stolenCar = new StolenCar();
        stolenCar.addObserver(policeCar);

        stolenCar.forward();
        stolenCar.left();
        stolenCar.forward();
        stolenCar.right();
    }
}
package behavioral.mediator;

abstract class Mediator {
    public abstract void sendMessage(String from, String to, String message);
}
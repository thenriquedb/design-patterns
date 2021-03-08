package behavioral.mediator;

class ParticipantImpl extends Participant {
    public ParticipantImpl(String name, Mediator mediator) {
        super(name, mediator);
    }

    public void sendMessage(String to, String message) {
        Mediator mediator = this.getMediator();
        mediator.sendMessage(this.getName(), to, message);
    }

    public void receiveMessage(String from, String message) {
        System.out.println("From: " + from + " => Message: " + message);
    }
}

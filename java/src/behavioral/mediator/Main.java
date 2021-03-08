package behavioral.mediator;

class Main {
    public static void main(String args[]) {
        ChatMediator chat = new ChatMediator();

        Participant joao = new ParticipantImpl("João", chat);
        Participant maria = new ParticipantImpl("Maria", chat);
        Participant carlos = new ParticipantImpl("Carlos", chat);
        Participant renato = new ParticipantImpl("Renato", chat);

        chat.registerParticipant(joao);
        chat.registerParticipant(maria);
        chat.registerParticipant(carlos);
        chat.registerParticipant(renato);

        joao.sendMessage("Maria", "Hi");
        maria.sendMessage("João", "Hello");
        carlos.sendMessage("Renato", "What's up?");
    }
}
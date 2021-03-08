package behavioral.mediator;

import java.util.Hashtable;
import java.util.ArrayList;

class ChatMediator extends Mediator {
    private Hashtable<String, Participant> participants = new Hashtable<String, Participant>();

    private ArrayList<String> forbiddenWords = new ArrayList<String>();

    public ChatMediator() {
        this.forbiddenWords.add("xxxxx");
        this.forbiddenWords.add("@!xxx");
        this.forbiddenWords.add("###@!");
    }

    public void registerParticipant(Participant participant) {
        if (! this.participants.containsKey(participant.getName())) {
            this.participants.put(participant.getName(), participant);
        } else {
            System.out.println("User is already registered");
        }
    }

    public void sendMessage(String from, String to, String message) {
        if (this.participants.containsKey(from) && this.participants.containsKey(to)) {
            Participant pFrom = this.participants.get(from);
            Participant pTo = this.participants.get(to);

            for (String forbidden : this.forbiddenWords) {
                if (message.contains(forbidden)) {
                    pFrom.receiveMessage("Mediator", "Your write message with forbidden words");
                    return;
                }
            }

            pTo.receiveMessage(from, message);
        }
    }
}
package behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
    private List<Command> commands = new ArrayList<Command>();
    private int current = 0;

    public void compute(Command command) {
        command.execute();
        commands.add(command);
        current++;
    }

    public void undo(int level) {
        for(int i = 0; i < level; i++) {
            if(current > 0) {
                Command command = commands.remove(--current);
                command.undo();
            }
        }
    }
}

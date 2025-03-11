package patterns.command;
import java.util.*;

public class OrderProcessor {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    public void process() {
        for (Command cmd : commands) {
            cmd.execute();
        }
    }
}

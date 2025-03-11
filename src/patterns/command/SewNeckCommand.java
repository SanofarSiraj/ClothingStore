package patterns.command;

public class SewNeckCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Sewing the neck of the T-shirt.");
    }
}

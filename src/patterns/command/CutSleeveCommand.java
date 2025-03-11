package patterns.command;

public class CutSleeveCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Cutting the sleeves of the T-shirt.");
    }
}

package command;

public class FlipUpCommand implements Command{
    private Light light;

    public FlipUpCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOn();
    }
}

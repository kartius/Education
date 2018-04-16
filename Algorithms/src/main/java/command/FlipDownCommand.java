package command;

public class FlipDownCommand implements Command {
    private Light light;

    public FlipDownCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.turnOff();
    }
}

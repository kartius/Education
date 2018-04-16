package command;

import static command.CommandCodes.OFF;
import static command.CommandCodes.ON;

public class PressSwitch {

    public static void main(String[] args) {
        final Light lamp = new Light();

        final Command switchUp = new FlipUpCommand(lamp);
        final Command switchDown = new FlipDownCommand(lamp);
        final Switch mySwitch = new Switch();

        mySwitch.storeAndExecute(ON,switchUp);
        mySwitch.storeAndExecute(OFF,switchDown);

        for (String key : mySwitch.getHistory().keySet()) {
            System.out.println(key);
        }
    }
}

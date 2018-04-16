package command;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Switch {

    private Map<String, Command> history = new HashMap<String, Command>();
//    private List<Command> history = new ArrayList<Command>();

    public void storeAndExecute(String code, Command command) {
        history.put(code, command); // optional
        command.execute();
    }

    public Map<String, Command> getHistory() {
        return history;
    }
}

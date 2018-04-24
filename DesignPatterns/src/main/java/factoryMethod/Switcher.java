package factoryMethod;

public class Switcher {

    public IGUIFactory getFactory(String check) {
        IGUIFactory factory = null;
        if (check.equals("OSX")) {
            factory = new OSXFactory();
//            factory = () -> new OSXButton(); just to think
        } else if (check.equals("Win")) {
            factory = new WinFactory();
        }
        return factory;
    }
}

package abstractFactory;

public class Runner {

    public static void main(String[] args) {
        IGUIFactory factory = null;
        final String check = "OSX";
        if (check.equals("OSX")) {
            factory = new OSXFactory();
//            factory = () -> new OSXButton(); just to think...
        } else if (check.equals("Win")) {
            factory = new WinFactory();
        }
        factory.createButton().paint();
    }
}

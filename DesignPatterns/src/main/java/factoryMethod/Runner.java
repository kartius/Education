package factoryMethod;

public class Runner {

    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        switcher.getFactory("OSX").createButton().paint();
        //alternative implementation
        EnumSwitcher.getFactory("WIN").createButton().paint();
    }
}
